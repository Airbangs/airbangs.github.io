---
layout: post
title: MAC常用命令学习（持续更新）
date: 2017-04-21
categories: blog
tags: [学习，记录]
description: 好记性不如烂笔头。
---



2017年4月21日 16:30:00

###查看或自己配置环境变量###
在命令行输入：echo $PATH，按回车执行命令查看当前变量值，这里我们将修改PATH变量来测试。
在命令行输入：sudo vi ~/.bash_profile，按回车输入密码后增加一行，如：
export PATH=$PATH:/test/notexist
意思是在PATH变量后面加多一个目录/test/notexist。
保存文件并重启终端，执行命令查看当前变量值，PATH变量后面增加/test/notexist。