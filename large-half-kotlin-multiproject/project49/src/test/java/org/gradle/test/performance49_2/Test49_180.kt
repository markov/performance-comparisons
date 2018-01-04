package org.gradle.test.performance49_2

import org.junit.Assert.*

class Test49_180 {
    private val production = Production49_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
