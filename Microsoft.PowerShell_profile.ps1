#Aliases
Set-Alias tt tree
Set-Alias ll ls
Set-Alias g git
Set-Alias vin nvim
Set-Alias less 'C:\Program Files\Git\usr\bin\less.exe'

# oh-my-posh config
oh-my-posh init pwsh --config 'C:\Program Files (x86)\oh-my-posh\themes\takuya.omp.json' | Invoke-Expression

# terminal icons
Import-Module -Name Terminal-Icons

# auto-completion
Import-Module PSReadLine
Set-PSReadLineOption -EditMode Emacs
Set-PSReadLineOption -BellStyle None 
Set-PSReadLineOption -PredictionSource History
Set-PSReadLineOption -PredictionViewStyle ListView

## scoop install fzf
## Install-Module -Name PSFzf -Force 
Import-Module PSFzf
Set-PSFzfOption -PSReadlineChordProvider 'Ctrl+f' -PSReadLineChordReverseHistory 'Ctrl+r'

#Fuctions
function which ($command) {
	Get-Command -Name $command -ErrorAction SilentlyContinue |
	Select-Object -ExpandProperty Path -ErrorAction SilentlyContinue
}

function runAS ($command) {
	if ($command -notlike "") {
		Start-Process -Verb RunAs $command
		return Write-Output 'done'
	}
		Write-Output 'param required'
}
