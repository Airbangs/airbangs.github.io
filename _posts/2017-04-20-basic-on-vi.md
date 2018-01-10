---
layout: post
title: VI常用命令（持续更新）
date: 2017-04-20
categories: blog
tags: [学习，记录]
description: 好记性不如烂笔头。
---



2017年4月20日 21:51:00    

一、文件命令    
打开单个文件:vim file

同时打开多个文件:vim file1 file2 file3 ...

二、移动光标(编辑模式)    
1、逐字符移动：   
    h: 左   
    l: 右   
    j: 下   
    k: 上   
    #h: 移动#个字符   
2、行间跳转

    #G：跳转至第#行
    gg: 第一行
    G：最后一行

四、翻屏   
Ctrl+f: 向下翻一屏   
Ctrl+b: 向上翻一屏   
Ctrl+d: 向下翻半屏  
Ctrl+u: 向上翻半屏   

五、删除命令: d   
d命令跟跳转命令组合使用   
    #dw, #de, #db    
dd: 删除当前光标所在行   
#dd: 删除包括当前光标所在行在内的#行；    

六、粘贴命令 p    
    p: 如果删除或复制为整行内容，则粘贴至光标所在行的下方，如果复制或删除的内容为非整行，则粘贴至光标所在字符的后面

七、复制命令 y   
    用法同d命令    

八、撤消编辑操作 u   
u：撤消前一次的编辑操作   
#u: 直接撤消最近#次编辑操作    
连续u命令可撤消此前的n次编辑操作    
撤消最近一次撤消操作：Ctrl+r   

九、查找   
    /PATTERN   
    ?PATTERN   
    n 下一个   
    N 上一个   

十、高级话题    
1、显示或取消显示行号   
    :set nu   
    :set nonu    
    mu = number   
2、显示忽略或区分字符大小写    
    :set ic    
    :set noic    
    ic = ignorecase    
3、设定自动缩进    
    :set ai   
    :set noai    
    ai = autoindent   
4、查找到的文本高亮显示或取消    
    :set hlsearch    
    :set nohlsearch    
5、语法高亮    
    :syntax on   
    :syntax off    
注:特性当前有效，如果想要永久有效需修改配置文件   

