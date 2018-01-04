package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_14 {
    private val production = Production42_14("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
