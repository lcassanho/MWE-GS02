package br.com.odd.mweGS.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.odd.mweGS.dto.VeiculoDTO;
import br.com.odd.mweGS.model.Regional;
import br.com.odd.mweGS.model.Veiculo;
import br.com.odd.mweGS.repository.VeiculoRepository;

@RestController
@RequestMapping("/api/veiculo")
@CrossOrigin
public class VeiculoController {

	@Autowired
	VeiculoRepository veiculoRepository;

	@GetMapping
	@PreAuthorize("hasRole('teste')")
	public ResponseEntity<List<Veiculo>> getAll() {

		List<Veiculo> veiculos = veiculoRepository.findAll();

		return ResponseEntity.ok(veiculos);
	}

	@PostMapping
    @PreAuthorize("hasRole('teste')")
    public ResponseEntity<Veiculo> insert(@RequestBody VeiculoDTO veDTO){
    	
		Veiculo veiculo = new Veiculo(veDTO);
				
		veiculoRepository.save(veiculo);

       return new ResponseEntity<>(veiculo, HttpStatus.CREATED);
    }

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('teste')")
	public ResponseEntity<Object> delete(@PathVariable int id) {

		veiculoRepository.deleteById(id);

		return ResponseEntity.ok("Veiculo Excluido!");
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasRole('teste')")
	public ResponseEntity<Veiculo> getById(@PathVariable int id) {

		Veiculo veiculo = veiculoRepository.findById(id).get();

		return ResponseEntity.ok(veiculo);

	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('teste')")
	public ResponseEntity<Veiculo> update(@PathVariable int id, @RequestBody VeiculoDTO veDTO) {

		Veiculo veiculo = new Veiculo(veDTO);

		veiculo.setId(id);
		veiculoRepository.save(veiculo);

		return ResponseEntity.ok(veiculo);
	}

}
