package elbar.company.learn_center_rest.controller;

import elbar.company.learn_center_rest.service.BaseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractController<S extends BaseService> implements BaseController {
    protected final S service;
}
