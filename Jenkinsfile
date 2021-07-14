@Library('shared-libs') _

pipeline{
	agent any
	parameters{
		string(name: "NAME", defaultValue: "JOHN DOE", description: "your own name")
		booleanParam(name: "TOGGLE", defaultValue: false, description: "turn it on or off")
	}
	stages{
		stage('shared-lib-testing'){
			steps{
			}

		}
	}
}
