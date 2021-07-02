Remove-Item .\target\dependency\*.*

mvn dependency:resolve
mvn install dependency:copy-dependencies

$jars = Get-ChildItem -Path 'target/dependency/*.jar'

Foreach ($jar in $jars) {
    New-Item -Path ('target/dependency/' + $jar.Name + '.AWSServices.RequiredLib') -ItemType File 
}

echo 'Dependencies should be in target/dependency'
