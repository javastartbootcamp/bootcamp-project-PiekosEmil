package pl.javastart.bootcamp.domain.training.lesson;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    List<Lesson> findByTrainingIdOrderByNumber(Long trainingId);
}
