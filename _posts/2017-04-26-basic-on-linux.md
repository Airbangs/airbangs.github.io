---
layout: post
title: Linux常用命令（持续更新）
date: 2017-04-26
categories: blog
tags: [学习，记录]
description: 好记性不如烂笔头。
---



2017年4月26日 10:40:00

一、命令： gzip    
语法：gzip ［选项］ 压缩（解压缩）的文件名   

-d 将压缩文件解压；   
例：解压缩   
gzip -d filename.gz   

-t 测试，检查压缩文件是否完整；    

注：gzip不能压缩整个目录。可以使用tar先打包，再压缩     
例如：   
$ tar cf test.tar test/   
$ gzip test.tar    
或    
$ tar czf test.tar.gz test/   