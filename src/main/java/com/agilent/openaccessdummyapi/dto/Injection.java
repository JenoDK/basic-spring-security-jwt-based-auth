package com.agilent.openaccessdummyapi.dto;

import java.util.List;

public record Injection(String sampleId, Integer vialNr, String workflow, String instrument, List<String> targets) {
}
