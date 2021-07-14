def call(Map param){
	if("${param.switch}"=="true"){
		println("${param.name}")
	}
	else{
		println("the switch is off")
	}
}
