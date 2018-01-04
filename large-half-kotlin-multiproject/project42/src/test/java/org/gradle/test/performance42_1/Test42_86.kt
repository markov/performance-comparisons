package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_86 {
    private val production = Production42_86("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
