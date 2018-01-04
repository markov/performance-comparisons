package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_462 {
    private val production = Production33_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}