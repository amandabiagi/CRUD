package projeto.crud.config.swagger;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.crud.model.Usuario;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

@Configuration
public class SwaggerConfigurations {


    public Docket crudApi(){
        return new Docket(DocumentationType.SWAGGER_2) //Tipo do documento que será gerado
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.projeto.crud")) // pacote inicial de onde o swagger vai começar a mapear
                .paths(PathSelectors.ant("/**")) //EndPoints liberados para o mapeamento
                .build() //criar build
                .ignoredParameterTypes(Usuario.class) //Classe que devará ser ignorada
                .globalOperationParameters(
                        Arrays.asList(  //Cria uma lista de parametros globais
                                new ParameterBuilder()
                                        .name("Authorization") //Nome do parametro
                                        .description("Header para Token JWT") //Descrição do parametro
                                        .modelRef(new ModelRef("string")) // Tipo do parametro
                                        .parameterType("header") //Tipo do parametro no caso é uma cabeçario
                                        .required(false)// Se é obrigatório o parametro
                                        .build()));


    }
}
