package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_398 {
    private val production = Production33_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}