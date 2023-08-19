package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Instrumento {

	private @Id @GeneratedValue Long id;
	private String nombre;
	private String categoria;
	private String descripcion;

	private Instrumento() {}

	public Instrumento(String nombre, String categoria, String descripcion) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Instrumento employee = (Instrumento) o;
		return Objects.equals(id, employee.id) &&
			Objects.equals(nombre, employee.nombre) &&
			Objects.equals(categoria, employee.categoria) &&
			Objects.equals(descripcion, employee.descripcion);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, nombre, categoria, descripcion);
	}

	@Override
	public String toString() {
		return "Instrumento{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", categoria='" + categoria + '\'' +
			", descripcion='" + descripcion + '\'' +
			'}';
	}
}