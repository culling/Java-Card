param(
    $JDKBin     = "C:\Program Files\Java\jdk1.8.0_144\bin\",
    $javaApp    = "_MainApp"
)

$JavaC = join-path $JDKBin "javac.exe"
$Java  = Join-path $JDKBin "java.exe"
#javac.exe $javaFile
$javaFiles = Get-ChildItem -Filter *.java
foreach ($javaFile in $javaFiles){
    Invoke-Command -Command { & $javaC $javaFile}
}
#java.exe  -cp . $javaApp
#Invoke-Command -Command { & $java }  
Invoke-command -Command {& $java $javaApp}