<template>
<view class="content">
	<view :style='{"minHeight":"100vh","padding":"0px 0 80rpx","borderColor":"#21d5ae","background":"#fff","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 32rpx","borderColor":"#e9be70","borderRadius":"0px","borderWidth":"0px","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","fontSize":"32rpx","color":"#8f8adb","textAlign":"right","fontWeight":"600"}' class="title">玩家账号</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="wanjiazhanghaoChange" :value="wanjiazhanghaoIndex"  :range="wanjiazhanghaoOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{wanjiazhanghaoOptions[wanjiazhanghaoIndex]}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 32rpx","borderColor":"#e9be70","borderRadius":"0px","borderWidth":"0px","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","fontSize":"32rpx","color":"#8f8adb","textAlign":"right","fontWeight":"600"}' class="title">玩家姓名</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' :disabled="ro.wanjiaxingming" v-model="ruleForm.wanjiaxingming" placeholder="玩家姓名"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 32rpx","borderColor":"#e9be70","borderRadius":"0px","borderWidth":"0px","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","fontSize":"32rpx","color":"#8f8adb","textAlign":"right","fontWeight":"600"}' class="title">评估时间</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' v-model="ruleForm.pinggushijian" placeholder="评估时间" @tap="toggleTab('pinggushijian')"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 32rpx","borderColor":"#e9be70","borderRadius":"0px","borderWidth":"0px","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="" @tap="pinggutupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","fontSize":"32rpx","color":"#8f8adb","textAlign":"right","fontWeight":"600"}' class="title">评估图片</view>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-if="ruleForm.pinggutupian" :src="baseUrl+ruleForm.pinggutupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0 20rpx 0px","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 32rpx","borderColor":"#e9be70","borderRadius":"0px","borderWidth":"0px","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","fontSize":"32rpx","color":"#8f8adb","textAlign":"right","fontWeight":"600"}' class="title">综合战力</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="zonghezhanliChange" :value="zonghezhanliIndex"  :range="zonghezhanliOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.zonghezhanli?ruleForm.zonghezhanli:"请选择综合战力"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"32rpx","color":"#8f8adb","fontWeight":"600"}' class="title">评估内容</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","padding":"24rpx 32rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","borderRadius":"0px","color":"#666","background":"url(http://codegen.caihongy.cn/20230306/d5965dd347be4def8903f02c041e6ca8.png) no-repeat left top / 32rpx,url(http://codegen.caihongy.cn/20230306/16f74414e92b43e495ddaf55761f753f.png) no-repeat right top / 32rpx,url(http://codegen.caihongy.cn/20230306/fd99570ac76d4301918546297b701a3b.png) no-repeat left bottom / 32rpx,url(http://codegen.caihongy.cn/20230306/267c8846963b4c0893ac3a9364a520e6.png) no-repeat right bottom / 32rpx,linear-gradient(180deg, rgba(247,250,254,.6) 0%, rgba(236,242,249,1) 100%)","borderWidth":"0px","width":"100%","fontSize":"32rpx","borderStyle":"solid","height":"auto"}' v-model="ruleForm.pingguneirong" placeholder="评估内容" @editorChange="pingguneirongChange"></xia-editor>
			</view>
			
			<view :style='{"padding":"0px","margin":"40rpx 0 0 0","background":"none","display":"flex","width":"100%","justifyContent":"center","height":"auto"}' class="btn" >
				<button :style='{"padding":"0 40rpx","boxShadow":"0px 12rpx 12rpx -6rpx #ccc","margin":"0 40rpx 0 0","borderColor":"#6dd5cb","color":"#333","display":"inline","minWidth":"240rpx","borderRadius":"40rpx","background":"#f0d9da","borderWidth":"0px","width":"auto","lineHeight":"88rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="pinggushijianConfirm" ref="pinggushijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				wanjiazhanghao: '',
				wanjiaxingming: '',
				pinggushijian: '',
				pinggutupian: '',
				zonghezhanli: '',
				pingguneirong: '',
				},
				wanjiazhanghaoOptions: [],
				wanjiazhanghaoIndex: 0,
				zonghezhanliOptions: [],
				zonghezhanliIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   wanjiazhanghao : false,
                   wanjiaxingming : false,
                   pinggushijian : false,
                   pinggutupian : false,
                   zonghezhanli : false,
                   pingguneirong : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
            this.ruleForm.pinggushijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 下2
			res = await this.$api.option(`wanjia`,`wanjiazhanghao`,{});
			this.wanjiazhanghaoOptions = res.data;
			// 自定义下拉框值
			this.zonghezhanliOptions = "5,4,3,2,1".split(',')

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`shuipingpinggu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='wanjiazhanghao'){
					this.ruleForm.wanjiazhanghao = obj[o];
					this.ro.wanjiazhanghao = true;
					continue;
					}
					if(o=='wanjiaxingming'){
					this.ruleForm.wanjiaxingming = obj[o];
					this.ro.wanjiaxingming = true;
					continue;
					}
					if(o=='pinggushijian'){
					this.ruleForm.pinggushijian = obj[o];
					this.ro.pinggushijian = true;
					continue;
					}
					if(o=='pinggutupian'){
					this.ruleForm.pinggutupian = obj[o].split(",")[0];
					this.ro.pinggutupian = true;
					continue;
					}
					if(o=='zonghezhanli'){
					this.ruleForm.zonghezhanli = obj[o];
					this.ro.zonghezhanli = true;
					continue;
					}
					if(o=='pingguneirong'){
					this.ruleForm.pingguneirong = obj[o];
					this.ro.pingguneirong = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
            pingguneirongChange(e) {
                this.ruleForm.pingguneirong = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
			// 下二随
			async wanjiazhanghaoChange (e) {
				this.wanjiazhanghaoIndex = e.target.value
				this.ruleForm.wanjiazhanghao = this.wanjiazhanghaoOptions[this.wanjiazhanghaoIndex]
				let res = await this.$api.follow(`wanjia`, `wanjiazhanghao`,{
					columnValue: this.ruleForm.wanjiazhanghao
				});
				if(res.data.wanjiaxingming){
					this.ruleForm.wanjiaxingming = res.data.wanjiaxingming
				}
			},

			// 多级联动参数


			// 日长控件选择日期时间
			pinggushijianConfirm(val) {
				console.log(val)
				this.ruleForm.pinggushijian = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			zonghezhanliChange(e) {
				this.zonghezhanliIndex = e.target.value
				this.ruleForm.zonghezhanli = this.zonghezhanliOptions[this.zonghezhanliIndex]
			},

			pinggutupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.pinggutupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {













//跨表计算判断
				var obj;
				if((!this.ruleForm.wanjiazhanghao)){
					this.$utils.msg(`玩家账号不能为空`);
					return
				}
				if(this.ruleForm.zonghezhanli&&(!this.$validate.isIntNumer(this.ruleForm.zonghezhanli))){
					this.$utils.msg(`综合战力应输入整数`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`shuipingpinggu`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`shuipingpinggu`, this.ruleForm);
						}else{
							await this.$api.add(`shuipingpinggu`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`shuipingpinggu`, this.ruleForm);
					}else{
						await this.$api.add(`shuipingpinggu`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
