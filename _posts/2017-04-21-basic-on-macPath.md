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


excel技巧
1､下拉多选不校验重复
Option Explicit
Sub Worksheet_Change(ByVal Target As Range)
'让数据有效性选择 可以多选,重复选
Dim rngDV As Range
Dim oldVal As String
Dim newVal As String
If Target.Count > 1 Then GoTo exitHandler
On Error Resume Next
Set rngDV = Cells.SpecialCells(xlCellTypeAllValidation)
On Error GoTo exitHandler
If rngDV Is Nothing Then GoTo exitHandler
If Intersect(Target, rngDV) Is Nothing Then
'do nothing
Else
Application.EnableEvents = False
newVal = Target.Value
Application.Undo
oldVal = Target.Value
Target.Value = newVal
If oldVal = "" Then
Else
If newVal = "" Then
Else
Target.Value = oldVal _
& ", " & newVal
End If
End If
End If
exitHandler:
Application.EnableEvents = True
End Sub
2､下拉多选校验重复
作者：jeremy
链接：https://www.zhihu.com/question/20484204/answer/275086097
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

Private Sub Worksheet_Change(ByVal Target As Range)
' Developed by Contextures Inc.
' www.contextures.com
Dim rngDV As Range
Dim oldVal As String
Dim newVal As String
If Target.Count > 1 Then GoTo exitHandler

On Error Resume Next
Set rngDV = Cells.SpecialCells(xlCellTypeAllValidation)
On Error GoTo exitHandler

If rngDV Is Nothing Then GoTo exitHandler

If Intersect(Target, rngDV) Is Nothing Then
   'do nothing
Else
  Application.EnableEvents = False
  newVal = Target.Value
  Application.Undo
  oldVal = Target.Value
  Target.Value = newVal
  If Target.Column = 10 or Target.Column = 11 Then '这里规定好哪一列的数据有效性是多选的，A列是第1列，依次类推，如3就是C列，7就是G列
    If oldVal = "" Then
      'do nothing
      Else
      If newVal = "" Then
      'do nothing
      Else
        If InStr(1, oldVal, newVal) <> 0 Then  '重复选择视同删除
          If InStr(1, oldVal, newVal) + Len(newVal) - 1 = Len(oldVal) Then '最后一个选项重复
            Target.Value = Left(oldVal, Len(oldVal) - Len(newVal) - 1)
          Else
            Target.Value = Replace(oldVal, newVal & ",", "") '不是最后一个选项重复的时候处理逗号
          End If
        Else '不是重复选项就视同增加选项
        Target.Value = oldVal & "," & newVal
'      NOTE: you can use a line break,
'      instead of a comma
'      Target.Value = oldVal _
'        & Chr(10) & newVal
        End If
      End If
    End If
  End If
End If

exitHandler:
  Application.EnableEvents = True
End Sub