package br.com.henrique.business;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.henrique.service.CourseService;

class CourseBusinessMockTestWithBDDTest {

    CourseService mockService;
    CourseBusiness business;
    List<String> courses;
    
    @BeforeEach
    void setup() {
        
        // Given / Arrange
        mockService = mock(CourseService.class);
        business = new CourseBusiness(mockService);
        
        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
            );
    }
    
    @Test
    void testCoursesRelatedToSpring_When_UsingAMock() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Leandro"))
            .willReturn(courses);
            
        // When / Act
        var filteredCourses =
            business.retriveCoursesRelatedToSpring("Leandro");
        
        // Then / Assert
        assertThat(filteredCourses.size(), is(4)); // bdd usando hamcrest
    }

    @DisplayName("Delete Courses not related to spring Using Mockito sould call method deleteCourse")
    @Test
    void deleteCoursesNotRelatedToSpring_UsingMockitoVerify_CallMethodDeleteCourse(){
        // Given / Arrange
        given(mockService.retrieveCourses("Leandro"))
        .willReturn(courses);

        // When / Act
        business.deleteNotCoursesRelatedToSpring("Leandro");

        // Then / Assert
        // verify(mockService)
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, times(1))
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, atLeast(2))
        verify(mockService, atLeastOnce())
            .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        verify(mockService)
            .deleteCourse("Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#");
        verify(mockService, never())
            .deleteCourse("REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker");
    }

}
