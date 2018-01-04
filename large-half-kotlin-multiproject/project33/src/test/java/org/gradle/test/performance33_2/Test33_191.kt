package org.gradle.test.performance33_2

import org.junit.Assert.*

class Test33_191 {
    private val production = Production33_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}