@Library('shared-libs') _

pipeline{
	agent any
	parameters{
		string(name: "NAME", defaultValue: "JOHN DOE", description: "your own name")
		booleanParam(name: "TOGGLE", defaultValue: false, description: "turn it on or off")
	}
	environment{
		name = "${params.NAME}"
		switch = "${params.TOGGLE}"
	}
	stages{
		stage('shared-lib-testing'){
			steps{
				func(name: "${env.NAME}", switch: "${env.TOGGLE}")
			}

		}
		stage('py-testing'){
			steps{
				pyscript()
			}
		}
	}
}
