def call(){
	script{
		def py = libraryResource('func.py')
		bat 'C:/Users/LENOVO/AppData/Local/Microsoft/WindowsApps/python3.exe -m py'
	}
}