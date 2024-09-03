package budget.team_vava.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import budget.team_vava.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // Voit lisätä hakukyselymetodeja tähän, jos tarpeen
}

