package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_489 {
    private val production = Production33_489("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}