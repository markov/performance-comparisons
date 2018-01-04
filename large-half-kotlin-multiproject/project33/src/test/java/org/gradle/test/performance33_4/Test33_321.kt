package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_321 {
    private val production = Production33_321("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}