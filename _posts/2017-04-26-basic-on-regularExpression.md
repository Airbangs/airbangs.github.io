---
layout: post
title: 常用正则表达式（持续更新）
date: 2017-04-26
categories: blog
tags: [学习，记录]
description: 好记性不如烂笔头。
---



2017年4月26日 14:07:00
示例一：
runoo+b，可以匹配 runoob、runooob、runoooooob 等，+ 号代表前面的字符必须至少出现一次（1次或多次）。
runoo*b，可以匹配 runob、runoob、runoooooob 等，*号代表字符可以不出现，也可以出现一次或者多次（0次、或1次、或多次）。
colou?r 可以匹配 color 或者 colour，? 问号代表前面的字符最多只可以出现一次（0次、或1次）。

示例二：
.	匹配除换行符 \n 之外的任何单字符。要匹配 . ，请使用 \. 。