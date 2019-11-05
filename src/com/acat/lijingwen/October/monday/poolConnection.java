//package com.acat.lijingwen.monday;
//
//import javax.sql.PooledConnection;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class poolConnection {
//     public Connection getConnection()throws SQLException{
//         //t调用 PooledConnection的getproxyConnection()方法返回真正的代理链接
//         return poolConnection(dataSource.getUsername(),dataSource.getPassword()).getProxyConnection();
//     }
//

//      //获取PooledConnection
////    使用数据库连接池之后，获取的数据库连接是从pooledDataSource中方法popConnection()huoqu
//    private PooledConnection pooledConnection(String username,String password)throws SQLException{
//         boolean countedWait = false;
//         PooledConnection conn = null;
//         long t = System.currentTimeMillis();
//         int localBadConnectionCount = 0;
//         //恒成立 直到上面定义的pooledConnection 被正确实例化或组合程序异常终止
//        while (conn==null){
//            //synchronized  是保证PooledDataSource 是一个线程安全的数据库连接池的原因
//            synchronized (state){
//                //如果当前数据库连接池中有空闲状态的数据库连接，则直接取出一个作为当前方法执行结果返回
//                if(state.idleConnection.size()>0){
//                    conn=state.idleConnections.remove(0);
//                    if (log.isDebugEnable()){
//                        log.debug("Checked out connection"+conn.getRealHashCode()+"form pool");
//                    }
//                }else{
//                    //如果当前活动状态的数据库连接未达到数据库连接池容纳的最大连接数创建一个并返回
//                    if(state.activeConnection.size()<poolMaximumActiveConnections){
//                        //创建一个内部持有真正数据库连接的PooledConnection
//                        conn=new PooledConnection(dataSource.getConnection(),this);
//                        @SuppressWarnings("unused")
//                        //真正的数据库连接
//                                Connection realConn = conn.getRealConnection();
//                        if (log.isDebugEnabled()) {
//                            log.debug("Created connection " + conn.getRealHashCode() + ".");
//                        }
//                    } else {
//                        // Cannot create new connection
//                        //取出最先放入活动状态数据库连接集合的数据库连接
//                        PooledConnection oldestActiveConnection = state.activeConnections.get(0);
//                        long longestCheckoutTime = oldestActiveConnection.getCheckoutTime();
//                        //如果过期、则创建一个新的、并将过期的这个从集合中移除
//                        if (longestCheckoutTime > poolMaximumCheckoutTime) {
//                            // Can claim overdue connection
//                            state.claimedOverdueConnectionCount++;
//                            state.accumulatedCheckoutTimeOfOverdueConnections += longestCheckoutTime;
//                            state.accumulatedCheckoutTime += longestCheckoutTime;
//                            state.activeConnections.remove(oldestActiveConnection);
//                            if (!oldestActiveConnection.getRealConnection().getAutoCommit()) {
//                                oldestActiveConnection.getRealConnection().rollback();
//                            }
//                            conn = new PooledConnection(oldestActiveConnection.getRealConnection(), this);
//                            oldestActiveConnection.invalidate();
//                            if (log.isDebugEnabled()) {
//                                log.debug("Claimed overdue connection " + conn.getRealHashCode() + ".");
//                            }
//                        } else {
//                            // Must wait
//                            //线程等待
//                            try {
//                                if (!countedWait) {
//                                    state.hadToWaitCount++;
//                                    countedWait = true;
//                                }
//                                if (log.isDebugEnabled()) {
//                                    log.debug("Waiting as long as " + poolTimeToWait + " milliseconds for connection.");
//                                }
//                                long wt = System.currentTimeMillis();
//                                state.wait(poolTimeToWait);
//                                state.accumulatedWaitTime += System.currentTimeMillis() - wt;
//                            } catch (InterruptedException e) {
//                                break;
//                            }
//                        }
//                    }
//                }
//                //如果经过上述步骤之后数据库连接不为空、则将此连接添加到数据库连接池中并作为结果返回。
//                if (conn != null) {
//                    if (conn.isValid()) {
//                        if (!conn.getRealConnection().getAutoCommit()) {
//                            conn.getRealConnection().rollback();
//                        }
//                        conn.setConnectionTypeCode(assembleConnectionTypeCode(dataSource.getUrl(), username, password));
//                        conn.setCheckoutTimestamp(System.currentTimeMillis());
//                        conn.setLastUsedTimestamp(System.currentTimeMillis());
//                        state.activeConnections.add(conn);
//                        state.requestCount++;
//                        state.accumulatedRequestTime += System.currentTimeMillis() - t;
//                    } else {
//                        if (log.isDebugEnabled()) {
//                            log.debug("A bad connection (" + conn.getRealHashCode() + ") was returned from the pool, getting another connection.");
//                        }
//                        state.badConnectionCount++;
//                        localBadConnectionCount++;
//                        conn = null;
//                        if (localBadConnectionCount > (poolMaximumIdleConnections + 3)) {
//                            if (log.isDebugEnabled()) {
//                                log.debug("PooledDataSource: Could not get a good connection to the database.");
//                            }
//                            throw new SQLException("PooledDataSource: Could not get a good connection to the database.");
//                        }
//                    }
//                }
//            }
//
//        }
//
//        if (conn == null) {
//            if (log.isDebugEnabled()) {
//                log.debug("PooledDataSource: Unknown severe error condition.  The connection pool returned a null connection.");
//            }
//            throw new SQLException("PooledDataSource: Unknown severe error condition.  The connection pool returned a null connection.");
//        }
//
//        return conn;
//    }
//
////闭包的样例
//    private static void concurrency() throws InterruptedException{
//        Thread thread =new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//
//            }
//        });
//    }
