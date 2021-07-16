@Library('shared-libs') _

pipeline{
	agent{
		label 'master'
	}
	parameters{
		string(name: "NAME", defaultValue: "JOHN DOE", description: "your own name")
		booleanParam(name: "TOGGLE", defaultValue: false, description: "turn it on or off")
	}
	environment{
		stringParam = "${params.NAME}"
		boolParam = "${params.TOGGLE}"
		env.PATH = env.PATH + ";C:\\Windows\\System32"
	}
	
	stages{
		stage('shared-lib-testing'){
			steps{
				func(name: "${env.stringParam}", switch: "${env.boolParam}")
			}

		}
		stage('py-testing'){
			steps{
				pyscript()
			}
		}
	}
}
