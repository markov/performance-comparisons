package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_469 {
    private val production = Production33_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}