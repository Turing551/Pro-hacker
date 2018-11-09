<?php 
function SieveOfEratosthenes($n) { 
	$prime = array_fill(0, $n+1, true); 
	for ($p = 2; $p*$p <= $n; $p++) { 
		if ($prime[$p] == true) {  
			for ($i = $p*2; $i <= $n; $i += $p) 
				$prime[$i] = false; 
		} 
	} 
	for ($p = 2; $p <= $n; $p++) 
		if ($prime[$p]) 
			echo $p." "; 
} 

	$n = 20; 
	echo "Following are the prime numbers "
	."smaller than or equal to " .$n."\n" ; 
	SieveOfEratosthenes($n); 
?>



//Time complexity : O(n*log(log(n)))
