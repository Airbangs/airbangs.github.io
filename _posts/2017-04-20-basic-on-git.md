---
layout: post
title: git常用命令（持续更新）
date: 2017-04-20
categories: blog
tags: [学习，记录]
description: 好记性不如烂笔头。
---



2017年4月120日 10:48:00

一、新建博客时所用命令总结:  
1.  
echo "# Hexo" >> README.md  
git init  
git add README.md  
git add .gitignore .npmignore 404.html CNAME Gruntfile.js Interview.html LICENSE README.md _config.yml  _includes/ _layouts/ _posts/ about.md archive.md css/ feed.xml fonts/ img/ index.html js/ less/ package.json tags.md works.md  
git commit -m "first commit"  
git remote add origin git@github.com:Airbangs/airbangs.github.io.git  
git push -u origin master

2.fatal: refusing to merge unrelated histories解决方法     
因为他们是两个不同的项目，要把两个不同的项目合并，git需要添加一句代码，在git pull，这句代码是在git 2.9.2版本发生的，最新的版本需要添加--allow-unrelated-histories  
假如我们的源是origin，分支是master，那么我们 需要这样写git pull origin master --allow-unrelated-histories需要知道，我们的源可以是本地的路径  

二、其它常用命令     
1.
初始化：git init   
设置推或抓取源：    
git push -u origin master   
抓取：   
git fetch --all   
git pull   

2.   
git重命名文件:           
git mv source-filename destination-filename    
git mv -n source-filename destination-filename（显示重命名会发生的改变，不进行重命名操作）   
git重命名文件夹:   
git mv -f oldfolder newfolder   

3.git提交并备注提交信息    
git commit -m "changed the foldername"

4.git删除文件操作   
git rm xxx

5.更新到最新
git fetch  
git checkout dayxx   

......