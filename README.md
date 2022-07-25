<div class="cover" style="page-break-after:always;font-family:方正公文仿宋;width:100%;height:100%;border:none;margin: 0 auto;text-align:center;">
    <div style="width:60%;margin: 0 auto;height:0;padding-bottom:20%;">
        </br>
        <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/%E5%8D%97%E5%BC%80%E5%A4%A7%E5%AD%A6logo.jpeg" alt="校名" style="width:80%;"/>
    </div>
    </br></br></br></br></br>
    <div style="width:60%;margin: 0 auto;height:0;padding-bottom:30%;">
        <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/%E5%8D%97%E5%BC%80%E5%A4%A7%E5%AD%A6%E6%A0%A1%E5%BE%BDlogo.jpg" alt="校徽" style="width:50%;"/>
	</div>
    </br></br></br></br></br></br></br></br>
    <span style="font-family:华文黑体Bold;text-align:center;font-size:20pt;margin: 10pt auto;line-height:30pt;">守护宝藏之射击游戏</span>
    <p style="text-align:center;font-size:14pt;margin: 0 auto">java大作业 </p>
    </br>
    </br>
    <table style="border:none;text-align:center;width:72%;font-family:仿宋;font-size:14px; margin: 0 auto;">
    <tbody style="font-family:方正公文仿宋;font-size:12pt;">
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">题　　目</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋"> 守护宝藏之射击游戏 </td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">上课时间</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋"> 周四早上</td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">授课教师</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋">刘明铭 </td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">姓　　名</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋"> 张怡桢</td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">学　　号</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋">2013747 </td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">年　　级</td>
    		<td style="width:%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋"> 2020级本科生</td>     </tr>
    	<tr style="font-weight:normal;"> 
    		<td style="width:20%;text-align:right;">日　　期</td>
    		<td style="width:2%">：</td> 
    		<td style="width:40%;font-weight:normal;border-bottom: 1px solid;text-align:center;font-family:华文仿宋">2022/6/28</td>     </tr>
    </tbody>              
    </table>
</div>

<!-- 注释语句：导出PDF时会在这里分页 -->

# 守护宝藏之射击游戏



<center><div style='height:2mm;'></div><div style="font-family:华文楷体;font-size:14pt;">张怡桢，2013747</div></center>
<center><span style="font-family:华文楷体;font-size:9pt;line-height:9mm">南开大学软件学院</span>
</center>
<div>
<div style="width:52px;float:left; font-family:方正公文黑体;">摘　要：</div> 
<div style="overflow:hidden; font-family:华文楷体;"> 两个光头小战士守护着象征人类智慧的宝藏，利用高超的射击技术，消灭所有的丧尸，并守护着宝藏。守护宝藏之射击游戏是我根据自己的兴趣设计的一款双人小游戏，游戏通过分析JAVA游戏开发和代码设计，用IntelliJ IDEA软件开发了守护宝藏之射击游戏。运用接口技术，使一个类能够实现多个接口，使用套接字Socket来完成client端和server端的连接。玩家通过连接访问进入游戏，通过操纵守护战士来守护宝藏，玩家还可以拾取装备来提升攻击力，摧毁全部丧尸来取得胜利，操作非常简单，适合所有人群玩。该游戏既满足了人们的个性化需求，也让玩家在游戏过程中丢掉烦恼，尽情地释放压力。
  </div>
</div>

<div>
<div style="width:52px;float:left; font-family:方正公文黑体;">关键词：</div> 
<div style="overflow:hidden; font-family:华文楷体;">java；Socket；多线程</div>
</div>




## 系统分析



### 技术分析

该游戏具有一套完整的规则系统，战士可以射击丧尸，丧尸也可以射击战士，丧尸的目标是攻击宝藏或者杀死杀死战士，而战士则需要层层过关才可以获得胜利，在游戏的设计时需要缜密的逻辑条理思维，同时也要考虑无法操控的因素和所有可能出现的突发事件。

#### 多线程

（1）主线程

战士由玩家通过方向键操作运动方向，通过s键来发射子弹。

（1）丧尸“线程”

丧尸由系统自动随机生成并随机发起攻击，丧尸的目标是攻击宝藏，需要有一定的智能性，因此敌方丧尸需要开创单独的线程让其自主运行，并且需要生成很多的丧尸。

要赋给丧尸消灭战士，抢夺宝藏的目标，所以需要精密得去设计丧尸操作运行的算法，使得丧尸具有一定的目的性与智能性。

（2）子弹“线程”

要对所有角色打出的子弹进行实时监测并判断它打到了什么物体对象，因此需要开辟一个独立的线程来处理子弹，还需要控制好所有的物体对象。



在同一时候，在JVM虚拟机上保持运行这么多的线程，可能会造成程序的迟钝，甚至瘫痪，所以需要用其他方法来解决这个问题！！！

#### 其他技术细节

（1）由于游戏界面中物体对象繁多，为了避免重叠运行，丧尸在前进时需要时刻地扫描周围环境。 

（2）游戏的动态画面是一个优秀程序不可缺少的组成成分，精美的用户界面是引起玩家兴趣的关键，相关的构图美化技术也需要有所考虑。

（3）在游戏地图中会有许多各种不同的物体对象，这不是绘图方法能够解决的，而且过多的大型图片会束缚程序的大小，所以要准确掌握Graphcis()方法的使用。同时使用读取外部文件的方法来加载游戏关卡，因为内存有限，不适合用于存储地图关卡。

（6）游戏要对玩家的分数进行记录，这就需要对其功能和属性进行妥善的策划，还需要制作良好的解决方案来处理其存储方式。

（7）为了确保游戏程序的运行顺畅，需要对结构进行严格把控，将算法完善得更精准，还可以运用混淆器对打包后的软件程序进行优化。



### 功能分析

游戏开始后，主机端创建并设置一个主机，客户端申请连接加入，若其IP输入判断无误，载入地图关卡并开始游戏，在游戏界面中，会实时显示剩余的需要打败的丧尸数量和玩家的生命数及分数。敌方丧尸自行移动和打出子弹，玩家通过敲击键盘来操控战士的动作并打出子弹，子弹无法打中相同阵营的对象，当两方阵营的子弹相交时会相互抵消，打中对方对象时会产生爆炸效果，中途可以暂停、发送信息，战士吃掉超级武器后会赋予其特殊的功能，在游戏的界面中还包含了通信的功能。

如果取得了胜利，会显示“恭喜你过关了！”，并进入下一个关卡，如果失败了，则系统给出“GAME OEVR!还想再玩一次吗？（y/n）”的提示，如果玩家双方都选择继续游戏，则游戏重新加载并开始，不然结束并退出游戏界面。



## 总体设计

<center><strong>  游戏总架构图</strong></center>

![image-20220630165647593](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220630165647593.png)

### 类设计

游戏由服务器端和客户端两部分组成。根据功能与需求，对该两类设计了许多类，以下分析

#### 服务器端和客户端中都存在的类

Actor类主要用来创建接口

base类主要用来创建宝藏并设置属性

bullet类主要用来创建子弹并设置属性

Ticker类主要用来创建时间信息

bomb类主要用来创建子弹打出后产生的爆炸效果

river类主要用来创建河道并设置属性

grass类主要负责创建草坪并设置属性

Steelwall类主要用来创建铁墙并设置属性

wall类主要用来创建和设置普通墙及其属性

level类负责创建关卡。

#### 服务器端

<center><strong>Server的关系图</strong></center>

![server类关系](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/server%25E7%25B1%25BB%25E5%2585%25B3%25E7%25B3%25BB.png)

<center><strong>表1  游戏服务器端各类功能表</strong></center>

| ServerControler | 处理来自服务器视图框架的输入     |
| --------------- | -------------------------------- |
| ServerModel     | 创建主机                         |
| ServerView      | 设置服务器端图形界面的面板信息   |
| enemy           | 创建丧尸                         |
| player          | 设置玩家的得分及其显示位置等信息 |
| drawingPanel    | 创建和设置服务器端界面窗口       |
| powerUp         | 设置吃到道具后的加强效果         |
| feedbackHandler | 判断指令并执行                   |
| Actor           | 创建接口                         |
| base            | 创建并设置基地                   |
| Ticker          | 创建并设置游戏线程               |
| bullet          | 创建子弹并设置属性               |
| bomb            | 设置爆炸效果                     |
| river           | 创建河道并设置属性               |
| grass           | 创建草坪并设置属性               |
| Steelwall       | 创建铁墙并设置属性               |
| wall            | 创建普通墙并设置属性             |
| level           | 创建关卡                         |

ServerModel类主要用来创建主机

ServerView类主要负责服务器端图形界面的面板信息的设置

ServerControler类处理来自服务器视图框架的输入，包括创立通信与帮助信息等

enemy类主要负责丧尸的创建

player类主要用来设置玩家的得分及其显示位置等信息

drawingPanel类主要负责服务器端界面窗口的创建和设置

powerUp类主要用来设置吃到道具后的加强效果

feedbackHandler类主要用来解码从客户端发来的指令字符串，再将其转换成指令来判断游戏失败后玩家是否继续游戏的问题

#### 客户端



<center><strong>Client的关系图</strong></center>

![client类关系](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/client%25E7%25B1%25BB%25E5%2585%25B3%25E7%25B3%25BB.png)

<center><strong>表2 游戏客户端各类功能表</strong></center>

| ClientModel        | 设置与服务器的连接               |
| ------------------ | -------------------------------- |
| ClientView         | 设置客户端端图形界面的面板信息   |
| ClientControler    | 负责处理来自客户端视图框架的输入 |
| drawingPanel       | 设置客户端窗口界面               |
| instructionHandler | 判断指令并执行                   |
| shield             | 设置战士的防护盾                 |
| normalObject       | 创建并描绘其他的物体对象         |
| level              | 创建关卡                         |
| base               | 创建并设置基地                   |
| Ticker             | 创建并设置游戏线程               |
| bullet             | 创建子弹并设置属性               |
| bomb               | 设置爆炸效果                     |
| river              | 创建河道并设置属性               |
| wall               | 创建普通墙并设置属性             |

ClientModel类主要用来设置与服务器的连接

ClientView类主要负责客户端端图形界面的面板信息

ClientControler类主要负责处理来自客户端视图框架的输入和创立通信与帮助信息等

drawingPanel主要用来设置客户端窗口界面

instructionHandler类主要用来解码从服务器端发来的指令字符串，再将其转换成指令来判断游戏失败后玩家是否继续游戏的问题

shield类主要负责设置战士吃掉保护图标获得保护时的状态

normalObject类主要用来创建和描绘其他物体对象



### 功能设计

#### 游戏联机

客户端与服务器端的连接访问通过使用套接字Socket来实现，客户端玩家输入主机地址来完成与服务器玩家的连接，两个玩家的游戏画面实时同步，一起攻击丧尸保护宝藏

#### 在线聊天

此游戏添加了通信功能，客户端与服务器端可以使用文本框进行在线交流

#### 游戏具体设计

双方通过使用指令键来操控自己的战士，丧尸和子弹则是自主随机运行，游戏中会对玩家的分数进行记录，还增加了特殊武器。

<center><strong>游戏具体功能图</strong></center>

![image-20220628213232425](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213232425.png)



### 总体流程图

<center><strong>图2  总体流程图</strong></center>

![image-20220628212618465](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628212618465.png)

## 技术与难点



###  技术难点：Socket通信

**功能：服务器与客户端的通信与同步 **

![image-20220630170215712](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220630170215712.png)

在游戏中，有服务器端*server*与客户端*client*，通过*Socket*套接字进行通信。

其中最大的问题是，*怎么让客户端与服务器的画面实时同步*——*通过两个类*Client.instructionHandler*与*Server.feedbackHandler*来编写变化标记功能与相对应的识别功能来同步画面，信息交流通过*String*来传递解析。*

<center><strong>Socket通信图</strong></center>

![image-20220630170336715](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220630170336715.png)



### 技术难点：子弹，丧尸与战士的运动“多线程”

**功能：画面运行流畅，可以正确反馈玩家的指令**

由于游戏上的动态元素过多，给每一颗子弹每一个丧尸都设置线程的话，游戏会出现卡顿以及卡bug的现象。事实上该项目的线程结构如下：

<center><strong>游戏的线程分析图</strong></center>

![image-20220630170804216](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220630170804216.png)

项目有四个线程，服务器主线程，客户端主线程，以及服务端的游戏线程，客户端的同步线程。主线程听取用户的输入，游戏的运行与同步在*gameModel*中的新线程。

*尽量保持较少的线程如何实现子弹以及丧尸的动态效果呢？*

```java
view.mainPanel.repaint();
Thread.sleep(30);
```

游戏中的画面中出现的物体皆为继承*Actor*接口的实体对象，其运动主线程监听用户的输入，通过不停更新所有对象的图片位置然后每30ms后刷新主界面来实现游戏的动态操作。

### 技术难点：图片的更新

**功能：收到炮弹攻击后外形的外观变化，吃到超级武器的外形变化**

```java
public Image[] textures;

//加载游戏
textures = new Image[88];
for(int i = 1; i < textures.length+1; i++)
	textures[i-1] = Toolkit.getDefaultToolkit().getImage("image/" + i + ".jpg");

```

使用*Toolkit.getDefaultToolkit().getImage()*一次性将图片导入缓存，后期触发特定的操作，外形进行变化。

图片的来源主要是从游戏元素网站爱给网上遴选的。

其中一次性将图片导入缓存，需要特殊的图片读取办法：Toolkit.getDefaultToolkit().getImage()中可以以字符串的形式读取括号内的信息"image/" + i + ".jpg"，所以可以一次性读入图片。

## 详细设计

### 游戏元素设计

游戏的画风较为美观大方，游戏的元素让人可以轻松快乐的进行游戏。

#### 战士设计

战士有4种等级，可以随着游戏的进行吃到道具而进行升级，除了外观上的升级还包括血量以及武器装备上的升级

<center><strong>1级战士</strong></center>

战士的初始状态

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628202125116.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628202502030.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628202354135.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628202217546.png" width="150"/>



<center><strong>2级战士</strong></center>

一级战士拾取武器之后，移动速度加快，装备升级

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213321997.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213358018.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213423450.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213438127.png" width="150"/>



<center><strong>3级战士</strong></center>

二级战士拾取到武器之后的再次升级
<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213321997.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213649415.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213715706.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213725165.png" width="150"/>



<center><strong>4级战士</strong></center>

玩家只有拾取到超级星星时才会进入该状态，该状态的战士health=2，武器装备最强，移动速度最快
<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213833079.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213857960.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213917381.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220628213942515.png" width="150"/>



#### 丧尸设计

丧尸一共有四种类型

| jpg_num | type | firepossibility | speed | health | mark   |
| ------- | ---- | --------------- | ----- | ------ | ------ |
| 39-46   | 1    | 0.95            | 2     |        | 普通的 |
| 3-10    | 2    | 0.95            | 4     |        | 快的   |
| 11-18   | 3    | 0.9             | 2     |        | 胖的   |
| 19-38   | else | 0.95            | 2     | 3      | 大boss |

<center><strong>普通丧尸</strong></center>

普通丧尸有两种形态，第一行是正常形态，第二行是暴走状态

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001031341.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001334154.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001205654.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001153052.png" width="150"/>

  <center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001031341.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002448432.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002513634.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002609573.png" width="150"/>

<center><strong>快丧尸</strong></center>

此种丧尸移动速度超快，一行为普通形态，二行为暴走状态
<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001433750.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001506851.png"width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001522397.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001543681.png" width="150"/>
  <center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001433750.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002655624.png"width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002840118.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002739118.png" width="150"/>

<center><strong>胖丧尸</strong></center>

此种丧尸移动速度慢，攻击力较普通丧尸更小一点，有两种形态，一行为普通形态，二行为暴走状态，如下
<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001820990.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001850661.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001841328.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629001831818.png" width="150"/>
  <center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002924348.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629003006054.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002952525.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002939352.png" width="150"/>

<center><strong>大boss丧尸</strong></center>

此种丧尸血很厚，形态很多，受到攻击后，形态会发生变化

大boss丧尸具有4种运动形态和一种暴走状态，4种运动状态分别代表着血量

第一种初始状态health=3

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002028360.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002103878.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002050222.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629002039214.png" width="150"/>
  收到第一次攻击后，health=2时的状态

 <center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004526077.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004538535.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004548869.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004559175.png" width="150"/>  

收到第二次攻击后，health=1时的状态

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629003836358.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629003855616.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629003905329.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004309878.png" width="150"/>

 收到第三次攻击后，health=0时的状态     

  <center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004349612.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004401032.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004410845.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004419229.png" width="150"/>  

 超级丧尸的暴走状态

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004719114.png" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004727245.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004735665.png" width="150"/>
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629004744992.png" width="150"/>
 

 以下是血量变化时形态变化的代码

```java
//如果丧尸被击中一颗子弹，判断会发生什么
	public void hurt(){
		if(flashing)
			gameModel.addActor(new powerUp(gameModel));
		flashing = false;
		boolean death = false;
		if(type != 4 )
			death = true;
		else{
			if(health == 0)
				death = true;
			else{
				if(health == 3){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[4+i];
				}else if(health == 2){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[8+i];
				}else if(health == 1){
					for(int i = 0; i < 4; i++)
						textures[i] = textures[12+i];
				}
				health--;
			}
		}
```

#### 道具设计

<center><strong>道具设计图</strong></center>

![image-20220629015013070](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629015013070.png)

如图所示：

第一个道具为超级星星，吃到该道具时，战士会升级成满级状态

第二个是护盾道具，战士会得到限时的红色框框保护战士不受攻击

第三个是武器道具，拾取该道具，战士会进行相应的升级，移动速度提高，子弹速度提高，**且子弹可以打破铁墙**；

第四个是宝藏墙升级，在宝藏周边会建立一层更加牢固的铁墙，更耐受攻击

第五个是血量道具，拾取该道具战士的生命值会加一

第六个是时间道具，拾取到该道具后，丧尸会限时全部停止运动

第七个是炸弹道具，拾取该道具后，全场的丧尸死亡清空

#### 地图设计

<center><strong>宝藏的设计</strong></center>

宝藏设计在地图的中间下部，周边会用普通墙围住进行一定程度的防御，战士的任务是守护宝藏

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/1.jpg" width="150"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/2.jpg" width="150"/>
  <center><strong>地图元素（不可行走）</strong></center>

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/54.jpg" width="100"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/71.jpg" width="100"/>    
  <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/72.jpg" width="100"/>   



第一个是铁墙元素，耐受攻击，

第二个是普通墙元素，防御力较铁墙弱

第三个是湖水元素，角色不能跨越湖水

以上三个元素皆为角色不可以跨越的元素

  <center><strong>地图元素（可行走）</strong></center>

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629021617125.png" width="400"/>
   <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629021823498.png" width="150"/>    

可以行走在上面的元素grass是用Graphics（）画的



### 面板功能设计

游戏面板是游戏程序的关键，这里使用了方法paintComponent(Graphics g)来进行建立并设置其属性，具体实现代码如下：

```java
public void paintComponent(Graphics g) {
		Graphics offScreenGraphics;
		if (offScreenImage == null) {
				offScreenImage = createImage(640, 550);
		}
		offScreenGraphics = offScreenImage.getGraphics();
		myPaint(offScreenGraphics);
		g.drawImage(offScreenImage, 0, 0, this);
	}
```

#### 宝藏基地的设计

1. base类定义了几个变量，通过构造器初始化了宝藏基地的变量参数

2. 使用g.drawImage()方法设置一幅图片来代表宝藏
3. 通过public void move(){}来处理基地受到铁墙防护时的变化，使用if()判断语句判断铁墙的保护时间。
4. 游戏的核心重点是宝藏的设置，一旦宝藏被毁，则玩家失败，游戏结束。

```java
//基地的基本属性设置
	public base(ServerModel gameModel){
		this.gameModel = gameModel;
		xPos = 260;
		yPos = 498;
		base = gameModel.textures[0];
		border = new Rectangle(xPos - 11, yPos - 11, 23, 23);
	}
//画出基地
	public void draw(Graphics g){
		g.drawImage(base, xPos - 12, yPos - 12, null );
	}
```

#### 丧尸的设计

敌方丧尸的设计

enemy类设置了丧尸的共同属性，并对不同的丧尸设置了不同的属性，如女性丧尸的移动速度会比较快，超级丧尸拥有多层保护壳的丧尸的生命数量与其拥有的形态数量一样等；

利用随机函数“Math.random()✖️4”随机生成一个随机值，并转换成整形数值，将此值赋给变量direction来作为敌方丧尸生成时的方向，再将“Math.random()✖️200”生成的随机值转换成整形数值，赋予变量interval来作为生成时的时间间隔，并且设置了丧尸的移动周期，在一个周期内将会朝着相同的方向继续移动，并设置了其在行进的过程中随机发射子弹。

而在特殊属性中，分别设置了丧尸的的攻击力、速度、图标等属性，再用方法draw(Graphics g){}向地图中加入丧尸的具体形态。具体实现代码如下：

```java
//设置全部敌人的共同属性
		interval = (int)(Math.random()*200);
		direction = (int)(Math.random()*4);
//根据不同类型的敌人设置独特的属性如：容貌,速度,等等
		if(type ==1 ){
			firePosibility = 0.95;
			speed = 2;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[38+i];
		}else if(type == 2){
			firePosibility = 0.95;
			speed = 4;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[2+i];
		}else if(type == 3){
			firePosibility = 0.9;
			speed = 2;
			textures = new Image[8];
			for(int i = 0; i < 8; i++)
				textures[i] = gameModel.textures[10+i];
		}else{
			firePosibility = 0.95;
			health = 3;
			speed = 2;
			textures = new Image[20];
			for(int i = 0; i < 20; i++)
				textures[i] = gameModel.textures[18+i];

		}
		//画出丧尸
public void draw(Graphics g){
		if(flashing && gameModel.gameFlow%10 > 4)
			g.drawImage(textures[textures.length-4+direction], xPos - size, yPos - size, null);
		else
			g.drawImage(textures[direction], xPos - size, yPos - size, null);
	}

```

#### 河道、草坪的设计

grass类继承了Actor接口;

grass类构造器定义了草坪的x，y坐标和矩形边界以及图标;

public void draw(Graphics g) {}方法绘制了草坪。

游戏双方丧尸及其子弹可以自由通过草坪。具体实现代码如下：

```java
//grass类构造器定义了草坪的x，y坐标和矩形边界以及图标;
public grass(int a, int b){
		xPos = a;
		yPos = b;
		border = new Rectangle(0,0,0,0);
	}
//画出草坪
	public void draw(Graphics g) {

		g.setColor(new Color(0, 128, 0));
		for(int i = yPos - 10; i <= yPos + 12; i+=5)
			g.drawLine(xPos - 12, i, xPos + 12, i);
		for(int i = xPos - 10; i <= xPos + 12; i+=5)
			g.drawLine( i, yPos - 12, i, yPos + 12);
  }
```

river类继承了Actor接口;

river类构造器定义了河道的x，y坐标和矩形边界以及图标;

g.drawImage（Image，int，int， ImageObserver）方法设置了一幅图片来代表河道。

在该游戏中将河道设置为不允许角色经过，但子弹可以自由通过，具体实现代码如下：

```java
//设置基本属性
	public river(int a, int b, ServerModel gameModel){
		this.gameModel = gameModel;
		river = gameModel.textures[71];
		xPos = a;
		yPos = b;
		Border = new Rectangle(xPos - 12, yPos - 12, 25, 25);
	}
//画出河道
	public void draw(Graphics g){
		g.drawImage(river, xPos - 12, yPos - 12, null);
	}

```

#### 墙与铁墙的设计

该模块通过new Rectangle(int x,int y,int width,int height)完成了一个矩形的创建，然后将其具体值赋给变量数组border[数组索引]生成了墙。

坐标x和y为绘制矩形时的起始点，width,height分别为矩形绘制的宽和高。通过构造器定义普通墙和铁墙的矩形边界和图标。具体实现代码如下：

```java
	//基本属性
public wall(int a, int b, ServerModel gameModel){
		xPos = a;
		yPos = b;
		this.gameModel = gameModel;
		wall = gameModel.textures[70];
		generalBorder = new Rectangle(xPos - 12, yPos - 12, 25, 25);
		border[0] = new Rectangle(xPos - 11, yPos - 11, 11, 11);
		border[1] = new Rectangle(xPos + 1, yPos - 11, 11, 11);
		border[2] = new Rectangle(xPos - 11, yPos + 1, 11, 11);
		border[3] = new Rectangle(xPos + 1, yPos + 1, 11, 11);
	}
	//画出

	public void draw(Graphics g) {
		if(walldestoried)
			return;
		g.drawImage(wall, xPos - 12, yPos - 12, null);
		g.setColor(new Color(170, 134, 98));
		if(shape[0])
			g.fillRect(xPos - 12, yPos - 12, 7, 7);
		if(shape[1])
			g.fillRect(xPos - 6, yPos - 12, 7, 7);
		if(shape[2])
			g.fillRect(xPos, yPos - 12, 7, 7);
		if(shape[3])
			g.fillRect(xPos + 6, yPos - 12, 7, 7);
		if(shape[4])
			g.fillRect(xPos - 12, yPos - 6, 7, 7);
		if(shape[5])
			g.fillRect(xPos - 6, yPos - 6, 7, 7);
		if(shape[6])
			g.fillRect(xPos, yPos - 6, 7, 7);
		if(shape[7])
			g.fillRect(xPos + 6, yPos - 6, 7, 7);
		if(shape[8])
			g.fillRect(xPos - 12, yPos, 7, 7);
		if(shape[9])
			g.fillRect(xPos - 6, yPos, 7, 7);
		if(shape[10])
			g.fillRect(xPos, yPos, 7, 7);
		if(shape[11])
			g.fillRect(xPos + 6, yPos, 7, 7);
		if(shape[12])
			g.fillRect(xPos - 12, yPos + 6, 7, 7);
		if(shape[13])
			g.fillRect(xPos - 6, yPos + 6, 7, 7);
		if(shape[14])
			g.fillRect(xPos, yPos + 6, 7, 7);
		if(shape[15])
			g.fillRect(xPos + 6, yPos + 6, 7, 7);
	}

```

#### 界面窗口的创建

在该模块中：

ServerView类的构造器中用super()方法调用父类构造器设置窗口题目为“守护宝藏之射击游戏（主机端/客户端）”；

使用JButton(String)定义了六个（退出、帮助、发送、暂停/继续、建立主机和隐藏）鼠标点击事件（即所谓的按钮）；

JTextField定义文本框，并将其设置为不可编辑。

new drawingPanel()和setBackground(Color c)创建一个面板并设置背景颜色；

setBounds()和setLayout()方法定义了页面的大小并将页面布局定义为空；

add（）方法向页面添加按钮和文本框；

setColor（Color c）方法设置面板颜色为指定颜色；

继承自java.awt.Graphics类中的drawString（String，int，int）方法向面板添加并输出当前关数及剩余敌人数，通过if判断语句进行判断，如果消灭丧尸数量到达设置的敌方丧尸数量则输出胜利场景。

```java
public ServerView(){

		super("守护宝藏之射击游戏（主机端）");


		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) { }

		getContentPane().setLayout(null);

		//制作动画绘制的主面板
		mainPanel = new drawingPanel();
		mainPanel.setLayout(null);
		mainPanel.setBounds(0,  22, 679, 605);
		mainPanel.setBackground(new Color(138, 152, 142,80));
		messageField = new JTextField();
		messageField.setBounds(0,519, 560,22);
		messageField.setEnabled(false);
		sendMessage = new JButton("发送");
		sendMessage.setBounds(570,518, 62,24);
		sendMessage.setFocusable(false);
		mainPanel.add(messageField);
		mainPanel.add(sendMessage);
		getContentPane().add(mainPanel);
		mainPanel.setFocusable(true);

		//制作选项按钮
		createServer = new JButton("建立主机");
		createServer.setBounds(0, 0,120,22);
		getContentPane().add(createServer);
		createServer.setFocusable(false);

		pauseAndResume = new JButton("暂停/继续");
		pauseAndResume.setBounds(120, 0,120,22);
		getContentPane().add(pauseAndResume);
		pauseAndResume.setFocusable(false);

		help = new JButton("帮助");
		help.setBounds(240, 0,120,22);
		getContentPane().add(help);
		help.setFocusable(false);

		exit = new JButton("退出");
		exit.setBounds(360, 0,120,22);
		getContentPane().add(exit);
		exit.setFocusable(false);

		//设置主框架
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 130, 640, 590);
    	setVisible(true);
    	setResizable( false );

		//设置服务器模式
		model = new ServerModel(this);

		//设置服务器控制器
		controler = new ServerControler(this, model);


	}
```



### 子弹功能设计

setColor()方法设置子弹颜色为浅灰色;

g.fillRect(int,int,int,int)方法设置子弹水平或垂直发射时的形状;

if()判断语句和equals()方法来鉴定子弹和什么东西相交，然后再处理相交时子弹和其他对象的属性变化。

具体代码如下：

```java
//setColor()方法设置子弹颜色为浅灰色;

//g.fillRect(int,int,int,int)方法设置子弹水平或垂直发射时的形状;
public void draw(Graphics g) {
		g.setColor(Color.lightGray);
		if(direction == 0 || direction == 1)
			g.fillRect(border.x + 1, border.y +1, 3, 9);
		if(direction == 2 || direction == 3)
			g.fillRect(border.x +1, border.y + 1, 9, 3);
	}

//if()判断语句和equals()方法来鉴定子弹和什么东西相交，然后再处理相交时子弹和其他对象的属性变化。
	public void move(){
		if(gameModel.gamePaused){
			writeToOutputLine();
			return;
		}


		//检查这子弹是否撞击地图边界
		if(!border.intersects(map)){
			gameModel.removeActor(this);
			notifiyOwner();
			makeBomb();
			writeToOutputLine();
			return;
		}
		//检查这颗子弹是否击中其他对象
		for(int i = 0; i < gameModel.actors.length; i++){
			if(gameModel.actors[i] != null){
				if(gameModel.actors[i] != this && gameModel.actors[i] != owner){
					if(border.intersects(gameModel.actors[i].getBorder())){

						if(gameModel.actors[i].getType().equals("steelWall")){
							Steelwall temp = (Steelwall)gameModel.actors[i];
							if(!temp.walldestoried){
								temp.damageWall(border,  bulletpower, direction);
								if(temp.bulletdestoried)
									hitTarget = true;
							}
						}else if(gameModel.actors[i].getType().equals("wall")){
							wall temp = (wall)gameModel.actors[i];
							if(!temp.walldestoried){
								temp.damageWall(border,  bulletpower, direction);
								if(temp.bulletdestoried)
									hitTarget = true;
							}
						}else if(gameModel.actors[i].getType().equals("bullet")){
							bullet temp = (bullet)gameModel.actors[i];
							if(temp.owner.getType().equals("Player")){
								hitTarget = true;
								gameModel.removeActor(gameModel.actors[i]);
								temp.notifiyOwner();
							}
						}else if(gameModel.actors[i].getType().equals("Player")){
							if(owner.getType().equals("enemy")){
								player temp = (player)gameModel.actors[i];
							    temp.hurt();
							}else{
							}
							hitTarget = true;
						}else if(gameModel.actors[i].getType().equals("enemy") && owner.getType().equals("Player")){
							enemy temp = (enemy)gameModel.actors[i];
							player tempe = (player)owner;
							if(temp.health == 0)
								tempe.scores+=temp.type*100;
							temp.hurt();
							hitTarget = true;
						}else if(gameModel.actors[i].getType().equals("base")){
							base temp = (base)gameModel.actors[i];
							temp.doom();
							hitTarget = true;
							gameModel.gameOver = true;
						}
					}
				}
			}
		}

		//如果子弹打到其他对象,从游戏系统中删除这个子弹对象
		if(hitTarget){
			gameModel.removeActor(this);
			notifiyOwner();
			makeBomb();
			writeToOutputLine();
			return;
		}

		if(direction == 0){
				border.y -= Speed;
				yPos -= Speed;
			}
			if(direction == 1){
				border.y += Speed;
				yPos += Speed;
			}
			if(direction == 2){
				border.x -= Speed;
				xPos -= Speed;
			}
			if(direction == 3){
				border.x += Speed;
				xPos += Speed;
		}
		writeToOutputLine();
	}
```



### 战士功能设计

if()判断语句和equals()方法来鉴定战士吃掉的特殊武器图标：

<center class="half">
    <img src="https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629015013070.png" width="400"/>

如果吃到炸弹图标，则已经出现了的丧尸全部被炸毁；

如果吃到爱心图标，玩家加一条生命；

如果吃到武器图标，提升玩家子弹火力并且速度加快，可以打破铁墙；

如果吃到盾图标，则玩家获得防护盾且免疫敌方子弹；

如果吃到铁墙图标，则基地由普通墙变为铁墙；

如果吃到时间图标，则时间停止，所有敌方丧尸静止。

具体代码如下：

```java
//power up 类
public powerUp(ServerModel gameModel){
		this.gameModel = gameModel;
		//加载图像
		textures = new Image[7];
		for(int i = 0; i < 7; i ++)
			textures[i] = gameModel.textures[46+i];

		xPos = 24 + (int)(Math.random()*475);
		yPos = 24 + (int)(Math.random()*475);
		int a = (int)(Math.random()*17);
		if(0 <= a && a< 3)
			function = 0;
		if(3 <= a && a < 6)
			function = 1;
		if(6 <= a && a < 9)
			function = 2;
		if(9 <= a && a< 12)
			function = 3;
		if(12 <= a && a < 15)
			function = 4;
		if(15 <= a && a < 16)
			function = 5;
		if(16 <= a && a < 17)
			function = 6;
		displaytime = 100 + (int)(Math.random()*630);
		border= new Rectangle(xPos - 12, yPos -12, 25, 25);
	}
```

```java
//player class
	//吃到道具
						if(gameModel.actors[i].getType().equals("powerUp")){
							scores+=50;
							powerUp temp = (powerUp)gameModel.actors[i];
							int function = temp.function;
							if(function == 0){  //普通武器，增加速度
								upgrade();
							}else if(function == 1){  //钢墙保护基地
								base tempe = (base)gameModel.actors[4];
								tempe.steelWallTime = 600;
							}else if(function == 2){   // 杀死所有的敌方丧尸
								for(int j = 0; j < gameModel.actors.length; j++)
									if(gameModel.actors[j] != null)
										if(gameModel.actors[j].getType().equals("enemy")){
											enemy tempe = (enemy)gameModel.actors[j];
											gameModel.addActor(new bomb(tempe.xPos, tempe.yPos, "big", gameModel));
											gameModel.removeActor(gameModel.actors[j]);
										}
									level.NoOfEnemy = 0;
									level.deathCount = 20 - level.enemyLeft;
							}else if(function == 3){   //防护盾，刀枪不入
								InvulnerableTime = 300 + (int)Math.random()*400;
							}else if(function == 4){  //冻结所有敌人
								enemy.freezedTime = 300 + (int)Math.random()*400;
								enemy.freezedMoment = ServerModel.gameFlow;
							}else if(function == 5){ //超级星星
								if(status < 3)
									numberOfBullet++;
								status =4;
								health = 2;
								if(type.equals("1P"))
									for(int j = 0; j < 4; j ++)
										textures[j] = gameModel.textures[66+j];
								else
									for(int j = 0; j < 4; j ++)
										textures[j] = gameModel.textures[84+j];
							}else if(function == 6){  // 增加生命
								life++;
							}

							gameModel.removeActor(gameModel.actors[i]);

						}
```



### 服务器设计

#### ServerModel类

在ServerModel类，实现了ActionListener接口，具备了监听功能。

创建了一些连接变量和游戏变量，设置了布尔类型的服务器状态变量，使用构造器完成了消息队列信息的设置；

使用createServer(){}方法建立主机，当布尔变量serverCreated的值为true时，主机创建成功；

设置了一个端口号，用try{}catch{}语句处理代码执行时发生的异常，并给出错误提示；

服务器通过accept()方法与客户端建立连接，当端口号没有被其他应用程序占用并IP地址正确，则成功完成连接，载入游戏，如若不然，就会显示相应的错误提示；

使用addMessage()在屏幕上显示消息，使用removeMessage()方法删除屏幕上的消息；

通过addActor()和remove()方法完成了向地图中增添新的物体对象和清除已经不存在了的物体对象的操作。

具体代码如下：

```java
	public ServerModel(ServerView thisview){

		view = thisview;
		messageQueue = new String[8];
		view.mainPanel.messageQueue = messageQueue;

		addMessage("欢迎来到守护宝藏之射击游戏主机端!  请点击\"建立主机\"按钮开始游戏" );

		t = new Ticker(1000);
		t.addActionListener(this);

	}


	public void createServer(){

 		addMessage("正在建立主机(端口9999,127.0.0.1)");

 		try {
			serverSocket = new ServerSocket(9999);
        	serverCreated = true;
        } catch (Exception e) {
			addMessage("无法建立主机，请确认端口9999没有被别的程序使用");
			System.out.println(e);
			t.stop();
			return;
        }

		addMessage("建立完成，等待玩家连接");

        try {
		   clientSocket = serverSocket.accept();
	       clientConnected = true;

	    	out = new PrintWriter(clientSocket.getOutputStream(), true);
		    in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));

	    } catch (Exception e) {
			addMessage("连接中出现错误，请重新建立主机");
			serverCreated = false;
			clientConnected = false;
			t.stop();

			//当发生错误，摧毁一切已创建的
			try{
				serverSocket.close();
				clientSocket.close();
				out.close();
				in.close();
			}catch(Exception ex){}

			return;
        }

		view.messageField.setEnabled(true);
		addMessage("玩家已连接上，开始载入游戏");

		//一旦客户端连接，然后告诉客户端开始加载游戏
		 out.println("L1;");

		//加载游戏
		textures = new Image[88];
		for(int i = 1; i < textures.length+1; i++)
			textures[i-1] = Toolkit.getDefaultToolkit().getImage("image/" + i + ".jpg");


		//设置第一关
		actors = new Actor[400];
		level.loadLevel(this);

		P1 = new player("1P", this);
		addActor(P1);
		P2 = new player("2P", this);
		addActor(P2);



		gameStarted = true;
		view.mainPanel.actors = actors;
		view.mainPanel.gameStarted = true;

	addMessage("载入完毕，游戏开始了！");
	}

	public void actionPerformed(ActionEvent e){
		createServer();

		//如果程序未能创建服务器，则什么也不做
		if(!serverCreated)
			return;

		//游戏逻辑回路，
		try{
			while((inputLine = in.readLine()) != null){
				//处理客户反馈消息
				feedbackHandler.handleInstruction(this, inputLine);

				outputLine = "";

				if(!gamePaused)
					gameFlow++;

				if(pausePressed){
					if(!gamePaused){
						outputLine+= "x0;";
					}else{
						outputLine+= "x1;";
					}
					pausePressed = false;
				}

				if(gameOver || (P1.life == 0 && P2.life == 0)){
					if(P1.freezed != 1)
						outputLine+="a;";


					if((P1.freezed != 1 || messageIndex == 1) && serverVoteYes){
						addMessage("等待用户端玩家的回应...");
					}
					if(P1.freezed != 1 || messageIndex == 0){
							addMessage("GAME OVER ! 　想再玩一次吗 ( y / n ) ?");
					}
					gameOver =  true;
					P1.freezed = 1;
					P2.freezed = 1;

					if(serverVoteNo && !serverVoteYes)
						System.exit(0);

					if(serverVoteYes){
						outputLine+="j;";
						if(clientVoteYes){
							addMessage("用户端玩家决定再玩一次，游戏重新开始了...");

							//重新启动游戏
							P1 = new player("1P", this);
							P2 = new player("2P", this);
							level.reset();
							level.loadLevel(this);
							gameOver = false;
							serverVoteYes = false;
							clientVoteYes = false;
							serverVoteNo = false;
							enemy.freezedMoment = 0;
							enemy.freezedTime = 0;
							gameFlow = 0;

							//告诉客户端程序重新启动游戏
							outputLine+="L1;";
						}
					}
				}

				if(level.deathCount == 20 &&  !gameOver){
					level.winningCount++;
					if(level.winningCount == 120){
						P1.freezed = 1;
						P2.freezed = 1;
					}
					if(level.winningCount == 470){
						if(P1.life > 0)
							P1.reset();
						if(P2.life > 0)
							P2.reset();
						level.loadLevel(this);
						//告诉客户端程序加载下一关
						outputLine+="L" +(1 +  (level.currentLevel-1)%8) + ";";
					}
					if(level.winningCount  == 500){
						P1.freezed = 0;
						P2.freezed = 0;
						level.deathCount = 0;
						level.winningCount = 0;
					}

				}

				//大量生产敌人丧尸
				if(!gamePaused)
					level.spawnEnemy(this);

				for(int i = 0; i < actors.length; i++){
					if(actors[i] != null)
						actors[i].move();
				}

				//从消息队列中删除一个消息每10秒，（如果有的话）
				if(gameFlow%300 == 0)
					removeMessage();

				//将玩家、关卡的信息写入输出行
				outputLine+="p" + level.enemyLeft + "," + level.currentLevel + "," + P1.life + "," + P1.scores + "," +  P2.life + "," + P2.scores +";";
				outputLine+="g" + level.winningCount + ";";

				//将玩家类型信息写入输出行
				if(!playerTypedMessage.equals("")){
					outputLine+=playerTypedMessage;
					playerTypedMessage = "";
				}

				//将最后的指令字符串发送到客户端程序
				out.println(outputLine);

				//调用视图重绘本身
				view.mainPanel.repaint();

				//如果玩家切换到对话框模式，则停止所有丧尸动作
				if(!view.mainPanel.hasFocus()){
					P1.moveLeft = false;
					P1.moveUp = false;
					P1.moveDown = false;
					P1.moveRight = false;
					P1.fire = false;
				}

				Thread.sleep(30);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			view.messageField.setEnabled(false);
			serverVoteYes= false;
			serverVoteNo = false;
			clientVoteYes = false;
			serverCreated = false;
			gameStarted = false;
			gameOver = false;
			gameFlow = 0;
			enemy.freezedTime = 0;
			enemy.freezedMoment = 0;
			view.mainPanel.gameStarted = false;
			t.stop();
			addMessage("玩家退出了，请重新建立主机");

			//当发生错误在游戏中，摧毁任何东西，包括游戏的变量
			try{
				out.close();
				in.close();
				clientSocket.close();
        		serverSocket.close();
			}catch(Exception exc){}

			//破坏游戏数据
			P1 = null;
			P2 = null;
			level.reset();
		}
	}

	//添加游戏对象（如丧尸，子弹等..）到游戏系统
	public void addActor(Actor actor){
		for(int i = 0; i < actors.length; i ++ )
			if(actors[i] == null){
				actors[i] = actor;
				break;
			}
	}

	//从游戏系统中移除游戏对象
	public void removeActor(Actor actor){
			for(int i = 0; i < actors.length; i ++ )
					if(actors[i] == actor){
						actors[i] = null;
						break;
			}
	}


	//在屏幕上显示一行消息
	public void addMessage(String message){
		if(messageIndex < 8){
			messageQueue[messageIndex] = message;
			messageIndex++;
		}
		else{
			for(int  i = 0; i < 7; i++)
				messageQueue[i] = messageQueue[i+1];
			messageQueue[7] = message;
		}

		//调用视图重绘屏幕如果游戏有没有开始
		if(!gameStarted)
			view.mainPanel.repaint();
	}

	//删除屏幕上最早的信息
	public void removeMessage(){
		if(messageIndex == 0)
			return;

		messageIndex--;
		for(int  i = 0; i < messageIndex; i++)
			messageQueue[i] = messageQueue[i+1];
		messageQueue[messageIndex] = null;

		//调用视图重绘屏幕如果比赛还没开始
		if(!gameStarted)
			view.mainPanel.repaint();
	}

```



#### feedbackHandler类

feedbackHandler类从客户端程序解码指令字符串,然后将字符串转换为真正的指令。

通过while(!instruction.substring(i, i+1).equals("？")){}语句来判断其指令，并根据其指令来完成相对性的操作。

```java
public static void handleInstruction(ServerModel gameModel, String instruction){
		if(instruction.length() == 0)
			return;

		int i = 0;
		while(i < instruction.length()){
			String perInstruction = "";

			//指令是“；”时
			while(!instruction.substring(i, i+1).equals(";")){
				perInstruction+=instruction.substring(i, i+1);
				i++;
			}

			//指令是“m”表明客户端运动信息
			if(perInstruction.substring(0,1).equals("m")){
				gameModel.P2.moveUp = false;
				gameModel.P2.moveDown = false;
				gameModel.P2.moveLeft = false;
				gameModel.P2.moveRight = false;
				gameModel.P2.fire = false;

				String temp = perInstruction.substring(1,2);
				if(temp.equals("1"))
					gameModel.P2.moveUp = true;
				temp = perInstruction.substring(2,3);
				if(temp.equals("1"))
					gameModel.P2.moveDown = true;
				temp = perInstruction.substring(3,4);
				if(temp.equals("1"))
					gameModel.P2.moveLeft = true;
				temp = perInstruction.substring(4,5);
				if(temp.equals("1"))
					gameModel.P2.moveRight = true;
				temp = perInstruction.substring(5,6);
				if(temp.equals("1"))
					gameModel.P2.fire = true;
			}

			//指令是“m”表示服务器玩家信息
			if(perInstruction.substring(0,1).equals("e")){
				gameModel.addMessage("用户端玩家说：" + perInstruction.substring(1,perInstruction.length()));
			}

			//指令是“j”表示客户端玩家想在玩一次
			if(perInstruction.substring(0,1).equals("j")){
				if(gameModel.gameOver)
					gameModel.clientVoteYes = true;
			}

			//指令是“x”表示服务器玩家暂停游戏
			if(perInstruction.substring(0,1).equals("x")){
				if(gameModel.gamePaused){
					gameModel.addMessage("用户端玩家取消了暂停");
					gameModel.gamePaused = false;
				} else if(!gameModel.gamePaused){
					gameModel.addMessage("用户端玩家暂停了游戏");
					gameModel.gamePaused = true;
				}
			}
			i++;
		}
	}

```

#### 其他各类设计

Lever类设置了不同的关卡，通过if(1+ (currentLevel-1)%8 == num){}判断语句来加入关卡，在进入下一关卡时，上一个关卡的所有东西都会被系统清理，并且增加了游戏难度。同时还设置了胜利场景。

Player类通过构造器设置了玩家的生命数量，生成时的方向和无敌时间，以及健康状态，子弹数量等。通过if(type.equals( "1P")){}elae{}来判断两个玩家并设置其战士的初始位置，用drawImage()方法绘制玩家战士，当玩家敲击开火键时，会用if()语句判断是否慢如条件，若满足就会生成一个子弹，并且子弹的位置、速度等属性参数都会被设置好，再通过add()方法添加子弹。在战士的下一个移动有效的前提下根据玩家战士的移动定义玩家战士的下一个边界，并判断是否与地图边界和其他物体对象相交，设置相交时战士与物体对象会发生的变化情况。当玩家战士被击毁时，其生命减少，使用reset（）方法将玩家战士路径重置为空，遗弃所有坐标和点类型，设置其位置为游戏开始时的位置。

在powerUp类中实现了战士吃到各种道具后发生变化的功能。

在Ticker类运用构造器建立了时间发生器，实现了runnable接口，并调用了其run()方法。

在ServerControler类处理来自服务器端视图框架的输入，实现了玩家消息互通功能。使用了构造器view.buttonName.addActionListener()方法完成了按钮功能的设计。使用addKeyListener(new KeyAdapter()){}方法增加了键盘输入的操作，再通过keyPressed(KeyEvent e)方法来实现，通过if(e.getKeyCode() == KeyEvent.VK_UP)语句来判断并执行相应的方向移动操作，通过if(e.getKeyChar() == 's')判断并执行”s”键的操作，if(e.getKeyCode()==e.VK_ENTER)判断是否点击Enter键，再通过if(e.getKeyChar() ==?)来判断输入什么键并执行相应的操作。通过keyReleased(KeyEvent e)方法来释放给定的键。具体代码如下：

```java
//操作发送消息按钮的动作
		view.sendMessage.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					if(!model.gameStarted){
						model.addMessage("还没有和别的玩家联上, 无法发送对话");
						return;
					}

					if(!view.messageField.getText().equals("")){
						model.addMessage("主机端玩家说：" + view.messageField.getText());
						model.playerTypedMessage += "m" + view.messageField.getText() + ";";
						view.messageField.setText("");
					}else{
						model.addMessage("对话内容不能为空");
					}
				}
			}
		);
```



### 客户端设计

#### ClientModel类

在ServerModel类，实现了ActionListener接口，具备了监听功能。

创建了一些连接变量和游戏变量，设置了布尔类型的客户端状态变量，使用构造器完成了消息队列信息的设置;

用try{}catch{}语句处理代码执行时发生的异常，给出错误提示;

使用add()方法向地图中添加对象;

客户端程序实际上不执行任何逻辑计算,它只接受指令，将指令字符串做出的反馈告诉客户端。

具体代码如下：

```java
public void connectServer(){
		addMessage("正在连接主机");

		try{
		 	serverIP = view.IPfield.getText();
		 	InetAddress addr = InetAddress.getByName(serverIP);
			clientSocket = new Socket(addr, 9999);

			out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		}catch(Exception e){
			t.stop();
			System.out.println(e);
			addMessage("连接中出现错误， 请确认 1. 输入的IP是否正确,   2. 主机端已存在");
			return;
		}

		serverConnected = true;
		addMessage("已成功连接到主机，开始载入游戏");
		view.IPfield.setFocusable(false);
		view.IPfield.setEnabled(false);

		//加载游戏 texture
		textures = new Image[88];
		for(int i = 1; i < textures.length+1; i++)
			textures[i-1] = Toolkit.getDefaultToolkit().getImage("image/" + i + ".jpg");


		drawingList = new Actor[400];

		gameStarted = true;
		view.mainPanel.gameStarted = gameStarted;;
		view.mainPanel.drawingList = drawingList;
		view.messageField.setEnabled(true);
		addMessage("载入完毕，游戏开始了！");
	}

```

#### instructionHandler类

instructionHandler类只有客户端可读，它对从服务器程序反馈的指令字符串进行解码，然后将字符串转换为真正的指令，通过while循环语句和if判断语句来判断指令，并执行相应的指令动作，具体实现方法如下：

```java
	public static void handleInstruction(ClientModel gameModel, String instruction){
		if(instruction.length() == 0)
			return;

		int i = 0;
		while(i < instruction.length()){
			String perInstruction = "";

			//指令由”;“开头在instruction-string分离
			while(!instruction.substring(i, i+1).equals(";")){
				perInstruction+=instruction.substring(i, i+1);
				i++;
			}

			//指令“L”开头是负载水平,其次是“L”数量水平指数
			if(perInstruction.substring(0,1).equals("L")){
				level.loadLevel(gameModel, Integer.parseInt(perInstruction.substring(1,2)));
				return;
			}

			//指令“w”开头意味着一些事情改变了在墙上的对象
			if(perInstruction.substring(0,1).equals("w")){
				int xPos = 0; int yPos = 0; boolean[] shape = new boolean[16];
				String temp = "";
				int j = 1;
				//得到x的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//墙的详细的边界
				for(int k = 0; k < 16; k++){
					if(perInstruction. substring(j, j+1).equals("1"))
						shape[k] = true;
					else
						shape[k] = false;
					j++;
				}

				//执行指令
				for(int k = 0; k < gameModel.drawingList.length; k++){
					if(gameModel.drawingList[k] != null){
						if(gameModel.drawingList[k].getxPos() == xPos && gameModel.drawingList[k].getyPos() == yPos){
							wall tempWall = new wall(xPos, yPos, 4, gameModel);
							tempWall.shape = shape;
							gameModel.drawingList[k] = tempWall;
						}
					}
				}
			}

			//指令“s”开头意味着一些事情改变了一个铁墙对象
			if(perInstruction.substring(0,1).equals("s")){
				int xPos = 0; int yPos = 0; boolean[] shape = new boolean[4];
				String temp = "";
				int j = 1;
				//得到x的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//详细的钢墙边境
				for(int k = 0; k < 4; k++){
					if(perInstruction. substring(j, j+1).equals("1"))
						shape[k] = true;
					else
						shape[k] = false;
					j++;
				}

				//执行指令
				for(int k = 0; k < gameModel.drawingList.length; k++){
					if(gameModel.drawingList[k] != null){
						if(gameModel.drawingList[k].getxPos() == xPos && gameModel.drawingList[k].getyPos() == yPos){
							Steelwall tempWall = new Steelwall(xPos, yPos, 4, gameModel);
							tempWall.shape = shape;
							gameModel.drawingList[k] = tempWall;
						}
					}
				}
			}

			//指令“b”开头意味着基地已被摧毁
			if(perInstruction.substring(0,1).equals("b")){
				gameModel.drawingList[4] = new normalObject(260, 498,  gameModel, "base", 1);
			}

			//指令“n”开头显示正常的对象,如丧尸、启动符号
			if(perInstruction.substring(0,1).equals("n")){
				int xPos = 0; int yPos = 0; int textureIndex = -1;
				String temp = "";
				int j = 1;
				//得到x对象的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y对象的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//获得对象的纹理指数
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				textureIndex = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new normalObject(xPos, yPos, gameModel, "normal", textureIndex));
			}


			//指令“t”开头表明子弹
			if(perInstruction.substring(0,1).equals("t")){
				int xPos = 0; int yPos = 0; int direction = -1;
				String temp = "";
				int j = 1;
				//得到x子弹的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y子弹的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//子弹的方向
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				direction = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new bullet(xPos, yPos, gameModel, direction));
			}

			//指令“o”开头表示一个炸弹
			if(perInstruction.substring(0,1).equals("o")){
				int xPos = 0; int yPos = 0; int size = -1;
				String temp = "";
				int j = 1;
				//得到x炸弹的位置
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y炸弹的位置
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				yPos = Integer.parseInt(temp);

				//炸弹的大小
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				if(temp.equals("small"))
					size = 1;
				else
					size = 0;
				//执行指令
				gameModel.addActor(new bomb(xPos, yPos, size, gameModel));
			}

			//指令“i”开头表明丧尸盾牌
			if(perInstruction.substring(0,1).equals("i")){
				int xPos = 0; int yPos = 0;
				String temp = "";
				int j = 1;
				//得到x位置的盾牌
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				xPos =  Integer.parseInt(temp);

				//得到y位置的盾牌
				temp = "";
				while(j < perInstruction. length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				yPos = Integer.parseInt(temp);

				//执行指令
				gameModel.addActor(new shield(xPos, yPos, gameModel));
			}

			//指令“p”开头表示水平和玩家信息
			if(perInstruction.substring(0,1).equals("p")){
				String temp = "";
				int j = 1;
				//得到敌人离开的数量
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.EnemyLeft =  Integer.parseInt(temp);

				//得到水平指数
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.LevelIndex =  Integer.parseInt(temp);

				//玩家1的生命量
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P1Life =  Integer.parseInt(temp);

				//玩家1的分数
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P1Score =  Integer.parseInt(temp);

				//玩家2的生命量
				temp = "";
				while(!perInstruction. substring(j, j+1).equals(",")){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P2Life =  Integer.parseInt(temp);

				//玩家2的分数
				temp = "";
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				j++;
				gameModel.view.mainPanel.P2Score =  Integer.parseInt(temp);
			}

			//指令“g”开头表明获取胜利的统计数量
			if(perInstruction.substring(0,1).equals("g")){
				String temp = "";
				int j = 1;
				//得到敌人离开的数量
				while(j < perInstruction.length()){
					temp+=perInstruction. substring(j, j+1);
					j++;
				}
				level.winningCount = Integer.parseInt(temp);
			}

			//指令“m”开头表示服务器玩家的信息
			if(perInstruction.substring(0,1).equals("m")){
				gameModel.addMessage("主机端玩家说：" + perInstruction.substring(1,perInstruction.length()));
			}

			//指令“a”开头表示游戏结束
			if(perInstruction.substring(0,1).equals("a")){
				if(!gameModel.gameOver){
					gameModel.addMessage("GAME OVER ! 　想再玩一次吗 ( y / n ) ?");
					gameModel.gameOver = true;
				}
			}
			//指令“j”开头表示服务器玩家想在玩一次
			if(perInstruction.substring(0,1).equals("j")){
				if(gameModel.gameOver)
					gameModel.serverVoteYes = true;
			}

			//指令“x”开头表示服务器玩家暂停游戏
			if(perInstruction.substring(0,1).equals("x")){
				int temp = Integer.parseInt(perInstruction.substring(1,2));
				if(temp == 0){
					if(gameModel.gamePaused){
						gameModel.addMessage("主机端玩家取消了暂停");
						gameModel.gamePaused = false;
					}
				}else{
					if(!gameModel.gamePaused){
						gameModel.addMessage("主机端玩家暂停了游戏");
						gameModel.gamePaused = true;
					}
				}
			}
			i++;
		}
	}
```



#### 其他各类的实现

在shield类中，使用了构造器，并实现了玩家吃掉护盾图标后获得的防护盾的功能，通过draw(Graphics g){}方法绘制防护盾，用方法setColor（Color c）设置其颜色，drawRect（）设置防护盾的x，y坐标和高度、宽度，当护盾时间结束时，通过removeActor()方法去除护盾。

在level类中，定义了游戏正在玩的关数，设置了不同的关卡，通过if(1+ (levelIndex-1)%8 == num){}判断语句来加入关卡，在进入下一关卡时，上一个关卡的所有东西都会被系统清理，并且增加了游戏难度。此类只有一层对象，所以是一个静态变量。

normalObject类代表所有其他对象。ClientControler类功能与ServerControler相同，都是实现按钮的功能和处理键盘输入操作。



## 游戏测试

### 测试方法

白盒测试主要是检查程序的内部逻辑结构设计。根据源代码的组织结构查找软件缺陷，但是如果要把整个网站系统的代码都要检测到也是不可能的，所以要选择最重要的核心的代码进行白盒测试。

黑盒测试不需要研究软件内部的逻辑结构和布局，以及代码的具体实现，它根据程序软件的作用和外部结构的特点来检查漏洞的存在，从整个程序使用过程的角度来检查漏洞，这就导致了黑盒测试只能局限的检查出该软件在功能和使用的时候的问题。

本游戏程序选择使用白盒测试方法。当然，还有其他的测试方法：比如静态分析方法和动态测试方法等等。我们可以在综合的需求分析之后进行选择。

### 系统测试

#### 游戏启动测试

运行IntelliJ IDEA中的server项目和client项目，游戏启动成功，看到了游戏界面。

<center><strong>启动测试图</strong></center>

![image-20220629035400880](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629035400880.png)




#### 页面按钮测试

1. 在服务器端，点击“建立主机”按钮，成功建立主机，并给出了提示。![](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629035559857.png)

2. 在客户端，在页面上方的文本框内输入IP地址：127.0.0.1，然后点击“连接主机”按钮。连接成功并给出提示，进入游戏。

   ![image-20220629035821073](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629035821073.png)

3. 点击帮助按钮，成功在页面上显示游戏的方法。![image-20220629040036503](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040036503.png)

4. 点击页面上方的暂停/继续按钮，若游戏正在进行，点击这个按钮就会暂停游戏，然后再点击，就会取消暂停，并且在页面上给出提示。在页面下方的文本框内输入对话消息，点击发送按钮，成功发送消息，并且在页面上显示了通话内容。![image-20220629040211974](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040211974.png)



#### 玩家战士测试

敲击方向键，战士成功向着相同的方向移动，点击“s”键，成功发射子弹。


![image-20220629040349725](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040349725.png)



#### 超级武器测试

在地图上随机的位置生成了随机的图标，玩家吃到各种图标后成功地获得了该图标所对应的功能。

![image-20220629040500075](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040500075.png)

#### 胜利与失败测试

在游戏中打败了所有丧尸，成功地显示了“恭喜你过关了！”界面。

![image-20220629041407088](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629041407088.png)

玩家战士数量为0或宝藏被敌方丧尸攻破了，成功地在页面上显示了“GAME OVER！想再玩一次吗（y/n）?”的消息。若游戏双方都选择都输入“y”，则游戏重新开始，并给出了提示。

![image-20220629040741593](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040741593.png)

#### 重新开始测试

在失败了之后页面上显示了“GAME OVER！想再玩一次吗（y/n）?”的消息。

游戏双方都选择都输入“y”，则游戏重新开始，并给出了提示。

![image-20220629040834928](https://zyzstc-1303973796.cos.ap-beijing.myqcloud.com/uPic/image-20220629040834928.png)



### 测试分析和小结

经过测试，游戏正常运行，并实现了游戏的全部主要功能，系统稳定地处理了游戏相关数据，对错误给出提示，对异常进行捕获和处理。由此可见，本游戏程序安全性较好，没有特别大的漏洞存在，系统结构清晰，页面设计也比较美观，具备了基本功能，总体上比较圆满地完成了当初游戏程序的设计的目标。

但是，对游戏程序来说，没有任何一个可以说是十全十美、毫无漏洞的，以现在国际上最受欢迎的美国Roit公司开发的英雄对战MOBA竞技游戏《英雄联盟》来说，都会有一些或多或少的漏洞，每周都会对游戏进行系统维护与更新，可想而知，本游戏虽然是一个相对来说非常简单的小游戏，但对于初次设计Java领域并进行游戏设计的本科生来说，不可能做到无懈可击，毫无漏洞可言，逻辑的复杂性，难以控制，因此到目前为止还存在一些bugs没有能够解决，如下：

1) 敌方丧尸智能化不够理想

2) 玩家战士与敌方丧尸相交时偶尔会发生重叠

3) 敌方丧尸数量的统计与显示有时会出错

4) 超级武器和玩家战士已经获得的特殊技能会随着暂停时间消失

5) 有时会莫名其妙的死机

## 结论

该游戏是基于Java语言，使用IntelliJ IDEA软件开发的一款守护宝藏之射击游戏, 该游戏包括对面板功能、角色功能、子弹功能的设计，在面板功能中对双方角色、宝藏基地、河道、草坪、普通墙与铁墙等地图元素进行创建并设置其属性，还实现了页面按钮功能，玩家可以点击按钮来实现相应的功能。

在角色功能中，设计了操作玩家战士的方法，还设置了超级武器，玩家吃掉后会获得特殊技能。

在子弹功能中，设置了子弹打中不同物体对象产生的不同效果。

另外，还实现了服务器与客户端的连接，加载关卡等功能，玩家在游戏面板中可以实时查看自己战士的生命数量和分数以及通关剩余需要打败的丧尸的数量，基本上完成了设计任务。

总体来说，本游戏有一定的逻辑性和复杂性，对玩家有一定的吸引力。

在设计与实现游戏的过程中，遇到一些逻辑问题和技术故障都是在所难免的，例如如何加载地图关卡和物体对象等、监探角色与地图元素是否碰撞等，都是需要完全克服的。该游戏还需要进一步的优化，需要在更大的程度上提升敌方丧尸的智能化、在地图中添加物体对象来增强可玩性等等。



## 本学期学习的心得体会

本学期是我在南开大学进行学习的第二年的最后一个学期，在疫情常态化下的情况下度过了这个学期。由于疫情的原因，我们在学习Java这门课时得到的在实验课上实操的机会并不多，原来安排好的上机考也在疫情形势来势汹汹的情况下被迫取消。

虽然在校内实操的机会没有我想的多，但是通过这次大作业的设计与实现，我学会了不少Java实操的技术，我学会创建服务器与客户端，并能在服务器与客户端之间进行交流，我学会将游戏分成服务器与客户端来进行实现，我学会了多线程，并学会随机生成游戏中的所需要的随机丧尸，我在设计游戏的GUI上花了许多精力，在学习写成该项目的能力上更是花了不少精力。从各个网站搜寻图片素材，从各个网站获取我对于技术难点的疑惑的解答，对于信息的搜索，我也更加熟悉。

希望在剩下两年的本科实习中，我能更加熟悉得掌握Java，能够更好的去用Java语言实现我的想法！





