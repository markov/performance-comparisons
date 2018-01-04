package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_145 {
    private val production = Production42_145("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
