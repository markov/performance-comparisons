package org.gradle.test.performance42_4

import org.junit.Assert.*

class Test42_360 {
    private val production = Production42_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
