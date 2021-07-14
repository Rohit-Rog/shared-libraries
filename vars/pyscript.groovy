def call(){
	script{
		def py = libraryResource('func.py')
		sh 'python py'
	}
}