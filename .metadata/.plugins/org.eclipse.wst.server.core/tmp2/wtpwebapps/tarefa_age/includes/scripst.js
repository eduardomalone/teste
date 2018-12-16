function mascara(o, f) {
	v_obj = o
	v_fun = f
	setTimeout("execMascara()", 1)
}

function execMascara() {
	v_obj.value = v_fun(v_obj.value)
}

function cpf(v) {
	v = v.replace(/\D/g, "")
	v = v.replace(/(\d{3})(\d)/, "$1.$2")
	v = v.replace(/(\d{3})(\d)/, "$1.$2")
	v = v.replace(/(\d{3})(\d{1,2})$/, "$1-$2")
	return v
}

function confirmRemocao() {
	
	return confirm("Confirmar remo\u00E7\u00E3o?");
	
}