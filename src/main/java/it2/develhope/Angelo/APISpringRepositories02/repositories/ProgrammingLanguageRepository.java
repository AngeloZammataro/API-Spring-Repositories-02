package it2.develhope.Angelo.APISpringRepositories02.repositories;
import it2.develhope.Angelo.APISpringRepositories02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", //posso anche aggiungere una path
        collectionResourceDescription = @Description("repo-prog-languages description"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
