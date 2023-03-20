package dev.blog.search.api.web;

import dev.blog.search.api.service.BlogSearchService;
import dev.blog.search.api.web.dto.req.BlogSearchRequestDto;
import dev.blog.search.api.web.dto.res.BlogSearchResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/blog")
@RequiredArgsConstructor
@RestController
public class BlogSearchController {
    private final BlogSearchService blogSearchService;

    @GetMapping("/search")
    public Page<BlogSearchResponseDto> getBlogsByCondition(BlogSearchRequestDto blogSearchRequestDto) {
        return blogSearchService.getBlogsByCondition(blogSearchRequestDto);
    }

}
