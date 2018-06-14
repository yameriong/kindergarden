package ac.bsedu.kindergarden.webservice.service;

import ac.bsedu.kindergarden.webservice.domain.posts.PostsRepository;
import ac.bsedu.kindergarden.webservice.web.dto.PostsSaveRequestDto;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PostsService {

  /**
   * Controller에서 Dto.toEntity를 통해서 바로 전달해도 되는데 굳이 Service에서 Dto를 받는 이유는 간단합니다.
   * Controller와 Service 의 역할을 분리하기 위함입니다.
   * 비지니스 로직 & 트랜잭션 관리는 모두 Service에서 관리하고, View 와 연동되는 부분은 Controller에서 담당하도록 구성합니다.
   */
  private PostsRepository postsRepository;

  @Transactional
  public Long save(PostsSaveRequestDto dto){
    return postsRepository.save(dto.toEntity()).getId();
  }
}
