# Java语言学习
----
## 目录
* [1.Java基础相关概念](#1)
    - [1.1Java语言的类型](#1)
    - [1.1Java基础相关概念](#2)
    - [1.1Java](#3)
* [2.Java基础基本语法](#2)
* [3.Java面向对象](#3)
* [4.Java常用API](#4)
* [5.Java异常与日志](#5)
* [6.Java集合](#6)
* [7.Java泛型与泛型程序设计](#7)
* [8.JavaIO流](#8)
* [9.Java注解](#9)
* [10.Java反射](#10)
* [11.Java并发与多线程](#11)

---
### <span id="1">1.Java基础相关概念</span>
---
### <span id="2">2.Java基础基本语法</span>
---
### <span id="3">3.Java面向对象</span>
---
### <span id="4">4.Java常用API</span>
---
### <span id="5">5.Java异常与日志</span>
---
### <span id="6">6.Java集合</span>
---
### <span id="7">7.Java泛型与泛型程序设计</span>
---
### <span id="8">8.JavaIO流</span>
---
### <span id="9">9.Java注解</span>
---
### <span id="10">10.Java反射</span>
---
### <span id="11">11.Java并发与多线程为重要模块</span>

# 前后端分离-shiro学习
# 技术：vue + spring boot + shiro
----
## 目录
* [1 前端项目搭建](#1)
    - [1.1 基本环境准备](#1.1)
        * [1.1.1 Node.js安装](#1.1.1)
        * [1.1.2 Node.js环境配置](#1.1.2)
    - [1.2 创建vue前端项目](#1.2)
* [2.后端项目搭建](#2)


### <span id="1">1 前端项目搭建</span>
----
#### <span id="1.1">1.1 基本环境准备</span>
#### <span id="1.1.1">1.1.1 Node.js安装</span>

Node.js 下载地址：<https://nodejs.org/zh-cn/>
Node.js 历史版本下载地址：<https://nodejs.org/dist/>

>特别注意：Linux 上安装 Node.js 需要安装 Python 2.6 或 2.7 ，不建议安装 Python 3.0 以上版本。(菜鸟教程)

下载后安装，可按照菜鸟教程Node.js安装教程来安装。

地址：<https://www.runoob.com/nodejs/nodejs-install-setup.html>

为了提高效率，可以使用淘宝的镜像：http://npm.taobao.org/

输入：npm install -g cnpm –registry=https://registry.npm.taobao.org，即可安装npm镜像，以后再用到npm的地方

直接用cnpm来代替。

#### <span id="1.1.2">1.1.2 Node.js环境配置</span>

环境配置主要是由于在使用Node.js时，会下许多安装包，这时需要考虑到是否会占用过多系统盘（一般C盘）空间而导致
PC性能降低，所以需要改变Node.js一些默认的配置，保证将来下载许多安装包后不会影响PC性能。

* 配置npm安装的全局模块所在的路径，以及缓存cache的路径
任意位置(系统盘除外)创建两个文件夹，根据键名知意的原则，这里创建了如下两个文件夹
![创建两个文件夹](https://upload-images.jianshu.io/upload_images/13118720-15d7a7ea8eb619b0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 设置全局目录和缓存目录，这里两种方式
    1. 命令行，打开cmd命令行窗口，输入：
    npm config set prefix "D:\whtTools\nodejs\node_global"
    npm config set cache "D:\whtTools\nodejs\node_cache"
    ![命令行修改配置](https://upload-images.jianshu.io/upload_images/13118720-4869774ad3d50a7a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
    2. 直接修改配置文件
    进入C:\Users\计算机用户名（如本人：C:\Users\Administrator）文件夹下，打开.npmrc文件直接修改
    ![直接修改配置文件](https://upload-images.jianshu.io/upload_images/13118720-aa631afb9e6ea117.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 环境变量配置
为了能够全局使用Node.js得命令，配置环境变量
右击‘我的电脑’>属性>高级系统配置>环境变量>系统变量 >新建（图片是编辑，自己需要新建），变量值为Node
安装目录下的node_modules文件夹
![图片为编辑，自己需要新建](https://upload-images.jianshu.io/upload_images/13118720-e0a8edd98182272f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
然后将修改系统变量Path，如下：
![修改系统变量Path](https://upload-images.jianshu.io/upload_images/13118720-984b0577693cf001.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
至此Node环境准备完成。

#### <span id="1.2">1.2 创建vue前端项目</span>

* 全局安装vue-cli

