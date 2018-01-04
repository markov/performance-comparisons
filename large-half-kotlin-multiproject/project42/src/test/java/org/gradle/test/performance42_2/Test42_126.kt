package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_126 {
    private val production = Production42_126("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
