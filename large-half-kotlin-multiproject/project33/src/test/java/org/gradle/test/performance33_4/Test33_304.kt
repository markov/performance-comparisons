package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_304 {
    private val production = Production33_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}