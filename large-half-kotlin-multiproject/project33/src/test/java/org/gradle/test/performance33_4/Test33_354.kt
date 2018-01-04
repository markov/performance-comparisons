package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_354 {
    private val production = Production33_354("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}