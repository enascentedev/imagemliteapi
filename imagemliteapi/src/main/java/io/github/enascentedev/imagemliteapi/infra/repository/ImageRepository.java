package io.github.enascentedev.imagemliteapi.infra.repository;

import io.github.enascentedev.imagemliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository <Image, String> {
}
