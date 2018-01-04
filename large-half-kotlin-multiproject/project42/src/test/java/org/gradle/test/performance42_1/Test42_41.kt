package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_41 {
    private val production = Production42_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
