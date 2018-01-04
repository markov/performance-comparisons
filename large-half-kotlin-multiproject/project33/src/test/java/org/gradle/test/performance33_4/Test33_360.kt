package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_360 {
    private val production = Production33_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}