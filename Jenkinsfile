@Library('shared-libs') _

pipeline{
	agent{
		docker{
			image 'python:3.9'
			label 'python3'
		}
	}
	parameters{
		string(name: "NAME", defaultValue: "JOHN DOE", description: "your own name")
		booleanParam(name: "TOGGLE", defaultValue: false, description: "turn it on or off")
	}
	environment{
		stringParam = "${params.NAME}"
		boolParam = "${params.TOGGLE}"
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
