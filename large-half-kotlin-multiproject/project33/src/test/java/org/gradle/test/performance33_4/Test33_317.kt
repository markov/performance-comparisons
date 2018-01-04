package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_317 {
    private val production = Production33_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}