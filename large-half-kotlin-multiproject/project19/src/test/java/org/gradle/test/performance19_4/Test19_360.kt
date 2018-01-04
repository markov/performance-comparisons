package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_360 {
    private val production = Production19_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}