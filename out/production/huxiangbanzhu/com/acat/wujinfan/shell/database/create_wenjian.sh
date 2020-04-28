#!/bin/bash

dir="/opt/test_dir"
if [ ! -d "$dir" ];then
    sudo mkdir $dir
    echo "创建文件夹成功"
else
    echo "文件夹已经存在"
fi