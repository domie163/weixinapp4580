<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"100rpx 0 500rpx","background":"url(http://codegen.caihongy.cn/20230307/094c3ad2a7b2458cb232f725b0df6c3c.png) no-repeat center top / 100% auto,url(http://codegen.caihongy.cn/20230307/8849983a5e0d4d478e58af3273722fb2.png) no-repeat center bottom / 100% auto,#c8d9eb","height":"100%"}'>
		<view :style='{"padding":"220rpx 40rpx 200rpx","boxShadow":"0px 0px 0px #ddd","borderColor":"#eee","margin":"0 auto","borderRadius":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230307/f3271c90048c489eac6e1dad3e5f7b8f.png) no-repeat center top / 100% auto,url(http://codegen.caihongy.cn/20230307/b55ee0c1c78748be9a3ed379b82c35f7.png) no-repeat center bottom / 100% auto,url(http://codegen.caihongy.cn/20230307/0edf45915c52473a89294f6620bb5eb9.png) repeat-y center center / 100% auto","borderWidth":"0px","display":"flex","width":"80%","borderStyle":"solid","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"40rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.wanjiazhanghao"  type="text"  class="uni-input" name="" placeholder="玩家账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.wanjiaxingming"  type="text"  class="uni-input" name="" placeholder="玩家姓名" />
			</view>
			<picker :style='{"boxShadow":"0px 0px 0px #2c77cb","margin":"0","borderColor":"#ddd","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='wanjia'"  @change="wanjiaxingbieChange" :value="wanjiaxingbieIndex" :range="wanjiaxingbieOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" @tap="wanjiatouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"border":"2rpx solid #ccc","minHeight":"160rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","width":"200rpx","height":"200rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"border":"2rpx solid #ccc","minHeight":"160rpx","borderRadius":"40rpx","objectFit":"cover","display":"block","width":"200rpx","height":"200rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","height":"auto"}' v-if="tableName=='wanjia'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"0px 0px 0px #2c77cb","margin":"0px","borderColor":"#ddd","color":"#333","borderRadius":"40rpx","background":"rgba(255,255,255,.8)","borderWidth":"2rpx","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.wanjiashouji"  type="text"  class="uni-input" name="" placeholder="玩家手机" />
			</view>
			<button :style='{"padding":"0px","boxShadow":"0px 6rpx 12rpx -10rpx #333","margin":"40rpx auto 24rpx","borderColor":"#6dd5cb","color":"#333","display":"block","borderRadius":"40rpx","background":"linear-gradient(270deg, rgba(249,236,236,1) 0%, rgba(240,217,218,1) 26%, rgba(200,217,235,1) 60%, rgba(236,242,249,1) 100%),#c8d9eb","borderWidth":"0px","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                wanjiaxingbieOptions: [],
                wanjiaxingbieIndex: 0,
				ruleForm: {
                wanjiazhanghao: '',
                mima: '',
                wanjiaxingming: '',
                xingbie: '',
                nianling: '',
                touxiang: '',
                wanjiashouji: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            }
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='wanjia'){
                this.wanjiaxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.wanjiaxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            wanjiaxingbieChange(e) {
                    this.wanjiaxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.wanjiaxingbieOptions[this.wanjiaxingbieIndex]
            },
            wanjiatouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
                    _this.$forceUpdate();
                });
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.wanjiazhanghao) && `wanjia` == this.tableName){
					this.$utils.msg(`玩家账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `wanjia` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`wanjia` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`wanjia` == this.tableName && this.ruleForm.wanjiashouji&&(!this.$validate.isMobile(this.ruleForm.wanjiashouji))){
					this.$utils.msg(`玩家手机应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
