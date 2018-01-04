package org.gradle.test.performance49_4

import org.junit.Assert.*

class Test49_307 {
    private val production = Production49_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
